package com.library.dao;

import com.library.entity.LoanDetail1;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO for LoanDetail1. Uses an in‑memory list as a fake database.
 */
public class LoanDetailDAO1 {
    private final List<LoanDetail1> fakeDb = new ArrayList<>();
    private int nextId = 1;

    /**
     * Insert a new loan detail. Assigns an auto‑generated id.
     * @param detail the loan detail to insert
     * @return true if insertion succeeded
     */
    public boolean insert(LoanDetail1 detail) {
        if (detail == null) return false;
        detail.setId(nextId++);
        fakeDb.add(detail);
        return true;
    }

    // Optional helper to retrieve all details (not required by the assignment)
    public List<LoanDetail1> findAll() {
        return new ArrayList<>(fakeDb);
    }
}
