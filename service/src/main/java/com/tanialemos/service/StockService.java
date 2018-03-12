package com.tanialemos.service;

import com.tanialemos.domain.Stock;
import com.tanialemos.domain.StockPrice;
import com.tanialemos.domain.StockRepository;
import com.tanialemos.interfaces.ExternalStockInformationService;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.Map;

public class StockService implements ExternalStockInformationService {

    StockRepository stockRepository = new StockRepository();

    public Stock getStock(String stockId){
        try {
            Map<String, Stock> connectionToFakeDB = stockRepository.getFakeDB();
            Stock stock = connectionToFakeDB.get(stockId);
            stock.setPrice(new StockPrice(getPriceInEuroForStock(stockId)));
            return stock;
        } catch (Exception e){

        }
    }

    public BigDecimal getPriceInEuroForStock(String stockId) {
        double nbr = RandomUtils.nextDouble(10,100);
        return BigDecimal.valueOf(nbr);
    }
}
