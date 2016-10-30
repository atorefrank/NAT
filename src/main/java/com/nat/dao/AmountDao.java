package com.nat.dao;

import com.nat.model.Amount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francisatore on 10/29/16.
 */

@Repository
public interface AmountDao extends CrudRepository<Amount, Long> {

    Amount save(Amount amount);
    Amount findByAmountId(Long amountId);

}
