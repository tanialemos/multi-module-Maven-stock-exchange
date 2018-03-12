package com.tanialemos.domain;

import java.math.BigDecimal;

public class StockPrice {

    private BigDecimal price;
    private StockCurrency currency;

    public StockPrice(BigDecimal price) {
        this.price = price;
        this.currency = StockCurrency.EUR;
    }

    public void setCurrency(StockCurrency currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public StockCurrency getCurrency() {
        return currency;
    }
}
