package fuck.you.yeswdl.mixins;

import fuck.you.yeswdl.LiteModYesWDL;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketCustomPayload;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetworkManager.class)
public class MixinNetworkManager {
	
	@Inject(method = "sendPacket(Lnet/minecraft/network/Packet;)V", at = @At("HEAD"), cancellable = true)
	private void sendPacket(Packet<?> packet, CallbackInfo ci) {
		if (!Minecraft.getMinecraft().isSingleplayer()) {
			if (packet instanceof CPacketCustomPayload) {
				String name = ((CPacketCustomPayload) packet).getChannelName();
				
				if (name.equalsIgnoreCase("wdl|init"))
					ci.cancel();
			}
		}
	}
	
}
