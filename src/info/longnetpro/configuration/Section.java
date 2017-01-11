package info.longnetpro.configuration;

import java.util.ArrayList;
import java.util.List;

public class Section extends ConfigurationNode {
	
	// Input/Output
	private String id;
	
	// Output
	final private List<Setting> settings = new ArrayList<Setting>(); 

	public List<Setting> getSettings() {
		return settings;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Section() {
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
