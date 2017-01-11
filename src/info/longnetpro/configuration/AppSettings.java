package info.longnetpro.configuration;

public class AppSettings extends ConfigurationNode {
	
	// Input/Output
	private String id;
	
	// Output
	private final Groups groups = new Groups();
	private final Sections sections = new Sections();
	
	public Sections getSections() {
		return sections;
	}

	public Groups getGroups() {
		return groups;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public AppSettings() {
		super();
	}

	@Override
	public boolean isIgnored() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resolve() {
		// TODO Auto-generated method stub
		
	}

}
