package model;

public class Document {

	private String documentName;
	private String author;
	private int publishYear;
	private int quantity;

	public Document() {
	}

	public Document(String documentName, String author, int publishYear, int quantity) {
		this.documentName = documentName;
		this.author = author;
		this.publishYear = publishYear;
		this.quantity = quantity;
	}

	public Document(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Document{" +
				"documentName='" + documentName + '\'' +
				", author='" + author + '\'' +
				", publishYear= " + publishYear +
				", quantity= " + quantity +
				'}';
	}
}