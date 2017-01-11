package info.longnetpro.configuration;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
	
	// Input/Output
	private String root;
	
	// Output
	final private List<AppSettings> groups = new ArrayList<AppSettings>();

	public Configuration() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public List<AppSettings> getGroups() {
		return groups;
	}

	public void resolve() {
		
	}
	
	public void loadFromFile(String file) {
		
	}
	
	private boolean checkRoot(String path) {
		if (path == null) {
			return false;
		}
		return true;
	}
	
	public String getConfigurationRoot() {
		String configRoot = ConfigurationManager.getPredefinedConfigurationRoot();
		if (!checkRoot(configRoot)) {
			configRoot = root;
		}
		return checkRoot(configRoot)? configRoot : null;
	}

}
