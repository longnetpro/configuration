package info.longnetpro.configuration;

import java.util.ArrayList;
import java.util.List;

public class Groups extends ConfigurationNode {
	
	// Output
	private final List<Group> list = new ArrayList<Group>();

	public List<Group> getList() {
		return list;
	}

	public Groups() {
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
