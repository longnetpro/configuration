package info.longnetpro.configuration;

import info.longnetpro.json.JsonType;

public class SettingValue {
	public static enum ValueType {
		STRING, JSON
	}
	
	private String stringResult;
	private JsonType jsonResult;
	private ValueType type;
	

	public SettingValue() {
		// TODO Auto-generated constructor stub
	}

	public String getStringResult() {
		return stringResult;
	}

	public void setStringResult(String stringResult) {
		this.stringResult = stringResult;
	}

	public JsonType getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(JsonType jsonResult) {
		this.jsonResult = jsonResult;
	}

	public ValueType getType() {
		return type;
	}

	public void setType(ValueType type) {
		this.type = type;
	}

}
