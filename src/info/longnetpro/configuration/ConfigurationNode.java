package info.longnetpro.configuration;

abstract public class ConfigurationNode {
	private String desctiption;
	private String textDescription;
	private boolean disabled = false;
	
	public ConfigurationNode() {
		
	}
	
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public String getDesctiption() {
		return desctiption;
	}
	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	
	abstract public boolean isIgnored();
	abstract public void resolve();
}
