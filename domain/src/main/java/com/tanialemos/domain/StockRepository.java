package com.tanialemos.domain;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class StockRepository {

    private Map<String, Stock> fakeDB = ImmutableMap.<String, Stock> builder()
            .put("A1", new Stock("A1", "FullProficiency"))
            .put("A2", new Stock("A2", "Proficiency"))
            .put("B1", new Stock("B1", "UpperIntermediate"))
            .put("B2", new Stock("B2", "Intermediate"))
            .put("C1", new Stock("C1", "Beginner"))
            .put("C2", new Stock("C2", "Newbie"))
            .build();

    public Map<String, Stock> getFakeDB() {
        return fakeDB;
    }
}
