package info.longnetpro.configuration;

import info.longnetpro.configuration.document.DocumentType;
import info.longnetpro.configuration.document.ReferencedDocument;

public class IncludedReference extends ConfigurationNode {
	
	// Input/Output
	private ReferencedDocument document;
	
	// Output only
	private DocumentType type; // this type can only be determined by reading the document and cannot be set

	public ReferencedDocument getDocument() {
		return document;
	}

	public void setDocument(ReferencedDocument document) {
		this.document = document;
	}

	public DocumentType getType() {
		return type;
	}

	public IncludedReference() {
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
