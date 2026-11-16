package com.library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity representing a loan slip (borrow transaction).
 */
public class LoanSlip1 {
    private int id;
    private Date borrowDate;
    private Date dueDate;
    private String loanStatus;
    private ReaderCard1 readerCard;
    private final List<LoanDetail1> loanDetails = new ArrayList<>();

    public LoanSlip1() {}

    public LoanSlip1(int id, Date borrowDate, Date dueDate, String loanStatus, ReaderCard1 readerCard) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.loanStatus = loanStatus;
        this.readerCard = readerCard;
    }

    // Getters
    public int getId() { return id; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getDueDate() { return dueDate; }
    public String getLoanStatus() { return loanStatus; }
    public ReaderCard1 getReaderCard() { return readerCard; }
    public List<LoanDetail1> getLoanDetails() { return loanDetails; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setBorrowDate(Date borrowDate) { this.borrowDate = borrowDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
    public void setLoanStatus(String loanStatus) { this.loanStatus = loanStatus; }
    public void setReaderCard(ReaderCard1 readerCard) { this.readerCard = readerCard; }

    @Override
    public String toString() {
        return "LoanSlip{id=" + id + ", status=" + loanStatus + "}";
    }
}
