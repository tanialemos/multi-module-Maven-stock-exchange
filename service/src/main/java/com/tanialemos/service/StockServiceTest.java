package com.tanialemos.service;

import com.tanialemos.domain.Stock;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;


class StockServiceTest {

    StockService stockService = new StockService();
    Stock stock = new Stock("test", "test_stock");

    @Test
    void getStock() {

    }

    @Test
    void getPriceInEuroForStock_givenAStockId_returnsRandomBigDecimalBetween10And100() {
        BigDecimal actualNbr = stockService.getPriceInEuroForStock("test");

        Assertions.assertThat(actualNbr).isBetween(BigDecimal.valueOf(10), BigDecimal.valueOf(100));
    }
}