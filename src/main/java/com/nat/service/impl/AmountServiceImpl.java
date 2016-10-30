package com.nat.service.impl;

import com.nat.dao.AmountDao;
import com.nat.model.Amount;
import com.nat.service.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by francisatore on 10/29/16.
 */

@Service
public class AmountServiceImpl implements AmountService {

    @Autowired
    AmountDao amountDao;

    @Override
    public Amount save(Amount amount) {
        return amountDao.save(amount);
    }

    @Override
    public Amount findByAmountId(Long amountId) {
        return amountDao.findByAmountId(amountId);
    }

}
