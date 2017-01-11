package info.longnetpro.configuration;

import java.util.ArrayList;
import java.util.List;

public class Group extends ConfigurationNode {

	// Input/Output
	private String id = "";
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// Output
	private final List<String> selectedSections = new ArrayList<String>();
	
	public List<String> getSelectedSections() {
		return selectedSections;
	}

	public Group(){
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
