package fuck.you.yeswdl;

import com.mumfrey.liteloader.LiteMod;

import java.io.File;

public class LiteModYesWDL implements LiteMod {
	
	/**
	 * Get the mod version string
	 *
	 * @return the mod version as a string
	 */
	@Override
	public String getVersion() {
		return "0.1";
	}
	
	/**
	 * Do startup stuff here, minecraft is not fully initialised when this
	 * function is called so mods <b>must not</b> interact with minecraft in any
	 * way here.
	 *
	 * @param configPath Configuration path to use
	 */
	@Override
	public void init(File configPath) {
	
	}
	
	/**
	 * Called when the loader detects that a version change has happened since
	 * this mod was last loaded.
	 *
	 * @param version       new version
	 * @param configPath    Path for the new version-specific config
	 * @param oldConfigPath Path for the old version-specific config
	 */
	@Override
	public void upgradeSettings(String version, File configPath, File oldConfigPath) {
	
	}
	
	/**
	 * Get the display name
	 *
	 * @return display name
	 */
	@Override
	public String getName() {
		return "YesWDL";
	}
	
}
