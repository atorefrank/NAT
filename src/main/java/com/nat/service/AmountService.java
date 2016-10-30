package com.nat.service;

import com.nat.model.Amount;

/**
 * Created by francisatore on 10/29/16.
 */
public interface AmountService {

    Amount save(Amount amount);
    Amount findByAmountId(Long amountId);

}
