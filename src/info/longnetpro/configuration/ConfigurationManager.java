package info.longnetpro.configuration;

public class ConfigurationManager {

	public ConfigurationManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static ConfigurationSettings resolveConfigurationFile(Configuration configuration, String appId, String groupId) {
		ConfigurationSettings settings = new ConfigurationSettings();
		settings.loadFromConfiguration(configuration, appId, groupId);
		return settings;
	}

	public static ConfigurationSettings resolveConfigurationFile(String file, String appId, String groupId) {
		Configuration configuration = new Configuration();
		configuration.loadFromFile(file);
		return resolveConfigurationFile(configuration, appId, groupId);
	}
	
	public static String getPredefinedConfigurationRoot() {
		return null;
	}

}
