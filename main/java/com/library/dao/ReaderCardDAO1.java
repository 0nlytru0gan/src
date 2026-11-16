package com.library.dao;

import com.library.entity.ReaderCard1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DAO for ReaderCard1. Uses an in‑memory list as a fake database.
 */
public class ReaderCardDAO1 {
    private final List<ReaderCard1> fakeDb = new ArrayList<>();

    public ReaderCardDAO1() {
        Date now = new Date();
        // Sample reader card with id 1, active status
        fakeDb.add(new ReaderCard1(1,
                new Date(now.getTime() - 365L * 24 * 60 * 60 * 1000), // issued a year ago
                new Date(now.getTime() + 365L * 24 * 60 * 60 * 1000), // expires in a year
                "ACTIVE"));
    }

    /**
     * Find a reader card by its code (here we treat the code as the numeric id).
     * @param code the code string
     * @return matching ReaderCard1 or null
     */
    public ReaderCard1 findByCode(String code) {
        try {
            int id = Integer.parseInt(code);
            for (ReaderCard1 rc : fakeDb) {
                if (rc.getId() == id) {
                    return rc;
                }
            }
        } catch (NumberFormatException e) {
            // ignore, fall through
        }
        return null;
    }
}
