package com.tanialemos.domain;

public enum StockCurrency {
    EUR ("Euro", "€"),
    USD ("American Dollars", "$"),
    GBP ("British Pounds", "£");

    private String name;
    private String symbol;

    StockCurrency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}

