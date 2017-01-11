package info.longnetpro.configuration.document;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import info.longnetpro.json.JsonParserException;
import info.longnetpro.json.JsonType;
import info.longnetpro.json.JsonUtils;

abstract public class ReferencedDocument {
	private String referencingDocument; // original referencing document -
										// absolute path
	private String reference; // relative path to the original document
	private String path; // absolute path of this document
	private boolean valid; // the document is valid

	public ReferencedDocument() {
	}

	public String getReferencingDocument() {
		return referencingDocument;
	}

	public void setReferencingDocument(String referencingDocument) {
		this.referencingDocument = referencingDocument;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean validateFileExistence() {
		if (path == null) {
			return false;
		}

		File f = new File(path);
		if (!f.exists() || !f.isFile()) {
			return false;
		}

		return true;
	}

	public Document validateXml() {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(path);
			doc.getDocumentElement().normalize();
			return doc;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public JsonType validateJson() {
		try {
			JsonType value = JsonUtils.parseJsonFile(path);
			return value;
		} catch (UnsupportedEncodingException | FileNotFoundException | JsonParserException e) {
			e.printStackTrace();
			return null;
		}
	}

	abstract void validate();

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

}
