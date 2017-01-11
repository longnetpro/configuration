package info.longnetpro.configuration;

public class DefaultSection extends Section {
	public void setId(String id) {
		super.setId(""); // default section if id is empty
	}

	public DefaultSection() {
		super();
	}
}
