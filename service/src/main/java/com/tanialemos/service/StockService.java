package com.tanialemos.service;

import com.tanialemos.interfaces.ExternalStockInformationService;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class StockService implements ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockId) {
        double nbr = RandomUtils.nextDouble(10,100);
        return BigDecimal.valueOf(nbr);
    }
}
