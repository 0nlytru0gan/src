package com.library.entity;

/**
 * Entity representing a document in the library.
 */
public class Document1 {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishYear;
    private String docType;
    private int totalQuantity;
    private int availableQuantity;

    public Document1() {}

    public Document1(int id, String title, String author, String publisher,
                    int publishYear, String docType, int totalQuantity, int availableQuantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.docType = docType;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = availableQuantity;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getPublishYear() { return publishYear; }
    public String getDocType() { return docType; }
    public int getTotalQuantity() { return totalQuantity; }
    public int getAvailableQuantity() { return availableQuantity; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }
    public void setDocType(String docType) { this.docType = docType; }
    public void setTotalQuantity(int totalQuantity) { this.totalQuantity = totalQuantity; }
    public void setAvailableQuantity(int availableQuantity) { this.availableQuantity = availableQuantity; }

    @Override
    public String toString() {
        return String.format("Document[id=%d, title=%s, author=%s, year=%d, type=%s, available=%d]",
                id, title, author, publishYear, docType, availableQuantity);
    }
}
