package info.longnetpro.configuration.document;

public enum DocumentType {
	APP_SETTINGS,
	GROUPS,
	GROUP,
	SELECTED,
	SECTIONS,
	SECTION,
	DEFAULT_SECTION,
	SETTING,
	JSON_SETTING;
	
	public boolean isAppSettings() {
		return this.equals(APP_SETTINGS);
	}
	
	public boolean isList() {
		return this.equals(GROUPS) || this.equals(SECTIONS);
	}

	public boolean isSection() {
		return this.equals(SECTION) || this.equals(DEFAULT_SECTION);
	}
	
	public boolean isSetting() {
		return this.equals(SETTING) || this.equals(JSON_SETTING);
	}
	
}
