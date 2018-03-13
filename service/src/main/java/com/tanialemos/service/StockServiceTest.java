package com.tanialemos.service;

import com.tanialemos.domain.Stock;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;


class StockServiceTest {

    StockService stockService = new StockService();


    @Test
    void connectToFakeDBAndGetStock_givenStockId_returnStockFromDB() {
        Stock expectStock = new Stock("C1", "Beginner");

        Stock actualStock = stockService.connectToFakeDBAndGetStock("C1");

        Assertions.assertThat(actualStock).isEqualToComparingFieldByField(expectStock);
    }

    @Test
    void connectToFakeDBAndGetStock_givenWrongStockId_shouldThrowIllegalArgumentException(){

    }

    @Test
    void getPriceInEuroForStock_givenAStockId_returnsRandomBigDecimalBetween10And100() {
        Stock stock = new Stock("test", "test_stock");
        BigDecimal actualNbr = stockService.getPriceInEuroForStock("test");

        Assertions.assertThat(actualNbr).isBetween(BigDecimal.valueOf(10), BigDecimal.valueOf(100));
    }
}