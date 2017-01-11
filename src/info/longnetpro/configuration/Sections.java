package info.longnetpro.configuration;

import java.util.ArrayList;
import java.util.List;

public class Sections extends ConfigurationNode {
	
	// Output
	private final List<Section> list = new ArrayList<Section>();

	public List<Section> getList() {
		return list;
	}

	public Sections() {
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
