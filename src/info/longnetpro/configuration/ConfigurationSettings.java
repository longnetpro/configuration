package info.longnetpro.configuration;

import java.util.HashMap;

public class ConfigurationSettings extends HashMap<String, SettingValue> {

	private static final long serialVersionUID = 1L;
	
	public void loadFromConfiguration(Configuration configuration, String appId, String groupId) {
		this.clear();
	}
}
