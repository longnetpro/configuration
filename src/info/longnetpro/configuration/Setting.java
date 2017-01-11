package info.longnetpro.configuration;

public class Setting extends ConfigurationNode {
	
	// Input/Output
	private String key = "";
	private String attributeValue = null;
	private String textValue = null;
	private boolean encrypted = false;
	
	// Output Only
	private String resolvedValue = null;

	public String getResolvedValue() {
		return resolvedValue;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getTextValue() {
		return textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public boolean isEncrypted() {
		return encrypted;
	}

	public void setEncrypted(boolean encrypted) {
		this.encrypted = encrypted;
	}

	public Setting() {
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
