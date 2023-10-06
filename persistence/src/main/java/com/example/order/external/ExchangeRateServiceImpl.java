package com.example.order.external;

import com.example.order.domain.external.ExchangeRateService;
import com.example.order.types.Currency;
import com.example.order.types.ExchangeRate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {
    @Override
    public ExchangeRate getExchangeRate(Currency source, Currency target) {
//        if (source.equals(target)) {
            return new ExchangeRate(BigDecimal.ONE, source, target);
//        }

    }
}
