package com.library.entity;

import java.util.Date;

/**
 * Entity representing a detail line of a loan slip (one document borrowed).
 */
public class LoanDetail1 {
    private int id;
    private Date returnDate; // null if not yet returned
    private String itemStatus; // e.g., "BORROWED", "RETURNED"
    private double fineAmount;
    private Document1 document;
    private LoanSlip1 loanSlip; // back‑reference (optional)

    public LoanDetail1() {}

    public LoanDetail1(int id, Date returnDate, String itemStatus, double fineAmount,
                       Document1 document, LoanSlip1 loanSlip) {
        this.id = id;
        this.returnDate = returnDate;
        this.itemStatus = itemStatus;
        this.fineAmount = fineAmount;
        this.document = document;
        this.loanSlip = loanSlip;
    }

    // Getters
    public int getId() { return id; }
    public Date getReturnDate() { return returnDate; }
    public String getItemStatus() { return itemStatus; }
    public double getFineAmount() { return fineAmount; }
    public Document1 getDocument() { return document; }
    public LoanSlip1 getLoanSlip() { return loanSlip; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setReturnDate(Date returnDate) { this.returnDate = returnDate; }
    public void setItemStatus(String itemStatus) { this.itemStatus = itemStatus; }
    public void setFineAmount(double fineAmount) { this.fineAmount = fineAmount; }
    public void setDocument(Document1 document) { this.document = document; }
    public void setLoanSlip(LoanSlip1 loanSlip) { this.loanSlip = loanSlip; }

    @Override
    public String toString() {
        return "LoanDetail{id=" + id + ", doc=" + (document != null ? document.getTitle() : "null") + ", status=" + itemStatus + "}";
    }
}
