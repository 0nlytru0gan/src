package com.library.dao;

import com.library.entity.LoanSlip1;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO for LoanSlip1. Stores loan slips in an in‑memory list.
 */
public class LoanSlipDAO1 {
    private final List<LoanSlip1> fakeDb = new ArrayList<>();
    private int nextId = 1;

    /**
     * Insert a new loan slip. The method assigns an auto‑generated id.
     * @param loanSlip the loan slip to insert (id may be 0)
     * @return true if insertion succeeded
     */
    public boolean insert(LoanSlip1 loanSlip) {
        if (loanSlip == null) return false;
        loanSlip.setId(nextId++);
        fakeDb.add(loanSlip);
        return true;
    }

    // Optional helper to retrieve all slips (not required by the assignment)
    public List<LoanSlip1> findAll() {
        return new ArrayList<>(fakeDb);
    }
}
