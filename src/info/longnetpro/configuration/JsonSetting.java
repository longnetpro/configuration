package info.longnetpro.configuration;

import info.longnetpro.configuration.document.ReferencedDocument;
import info.longnetpro.json.JsonNull;
import info.longnetpro.json.JsonType;

public class JsonSetting extends Setting {
	
	// Input/Output
	private ReferencedDocument document = null;
	
	// Output only
	private JsonType resolvedValue = JsonNull.NULL;

	public JsonType getResolvedJsonValue() {
		return resolvedValue;
	}

	public JsonSetting() {
		super();
	}
	
	public ReferencedDocument getDocument() {
		return document;
	}

	public void setDocument(ReferencedDocument document) {
		this.document = document;
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
