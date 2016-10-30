package com.nat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by francisatore on 10/29/16.
 */

@Entity
public class Amount{

    public Amount(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long amountId;

    private double value;

    private int dollars;

    private int halfdollar;

    private int quarters;

    private int dimes;

    private int nickels;

    private int pennies;

    public Long getAmountId() {
        return amountId;
    }

    public void setAmountId(Long amountId) {
        this.amountId = amountId;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public void setHalfdollar(int halfdollar) {
        this.halfdollar = halfdollar;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    public double getValue() {
        return value;
    }

    public int getDollars() {
        return dollars;
    }

    public int getHalfdollar() {
        return halfdollar;
    }

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        if (Double.compare(amount.value, value) != 0) return false;
        return amountId != null ? amountId.equals(amount.amountId) : amount.amountId == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = amountId != null ? amountId.hashCode() : 0;
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}