package com.tanialemos.interfaces;

import java.math.BigDecimal;

public interface ExternalStockInformationService {
    BigDecimal getPriceInEuroForStock(String stockId);
}
