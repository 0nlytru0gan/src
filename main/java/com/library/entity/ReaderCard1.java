package com.library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity representing a reader card in the library system.
 */
public class ReaderCard1 {
    private int id;
    private Date issueDate;
    private Date expiryDate;
    private String cardStatus;
    private final List<LoanSlip1> loanSlips = new ArrayList<>();

    public ReaderCard1() {}

    public ReaderCard1(int id, Date issueDate, Date expiryDate, String cardStatus) {
        this.id = id;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.cardStatus = cardStatus;
    }

    // Getters
    public int getId() { return id; }
    public Date getIssueDate() { return issueDate; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCardStatus() { return cardStatus; }
    public List<LoanSlip1> getLoanSlips() { return loanSlips; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }
    public void setCardStatus(String cardStatus) { this.cardStatus = cardStatus; }

    @Override
    public String toString() {
        return "ReaderCard{id=" + id + ", status=" + cardStatus + "}";
    }
}
