package com.nat.controller;

import com.nat.model.Amount;
import com.nat.service.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import utils.AmountUtils;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by francisatore on 10/29/16.
 */
@Controller
@RequestMapping("/amount")
public class AmountController {
    @Autowired
    AmountService amountService;


    //this method can be used inside a page
    @RequestMapping(value="/saveAmount", method = RequestMethod.POST)
    public String saveAmount(@Valid @ModelAttribute Amount amount, BindingResult errors, Model model) {

        if (!errors.hasErrors()) {
            LinkedHashSet<Amount> amounts = AmountUtils.buildCoins();
            double currentValue = amount.getValue();

            int change = (int)(Math.ceil(currentValue*100)); //rounds up to the last penny

            int dollars = Math.round(change / 100); //calculates number of dollars

            int remainderDollar= change % 100; //calculates remaining amout less dollars
            int halfdollar = Math.round(remainderDollar / 50); //calculates number of halfdollars

            int remainderHalf = remainderDollar % 50; //calculates remaining amount less halfdollars
            int quarters = Math.round(remainderHalf / 25); //calculates number of quarters

            int remainderDime = remainderHalf % 25; //calculates remaining amount less quarters
            int dimes = Math.round(remainderDime / 10); //calculates number of dimes

            int remainderNickel = remainderDime % 10; //calculates remaining amount less dimes
            int nickels = Math.round(remainderNickel / 5); //calculates number of nickels

            int remainderPenny = remainderNickel % 5; //calculates remaining amount less nickels
            int pennies = Math.round(remainderPenny / 1); //calculates number of pennies

            //Setting the attributes in the object so that I can access them
            amount.setDollars(dollars);
            amount.setHalfdollar(halfdollar);
            amount.setQuarters(quarters);
            amount.setDimes(dimes);
            amount.setNickels(nickels);
            amount.setPennies(pennies);
            amounts.add(amount);
            amountService.save(amount);
            model.addAttribute("amounts", amounts);
        }
        return ((errors.hasErrors()) ? "newamount" : "amount");

    }

    @RequestMapping(value = "/addAmount", method = RequestMethod.GET)
    public String addAmount(Model model) {
        //Instantiate the new object
        model.addAttribute("amount", new Amount());
        return "newamount";
    }

    @RequestMapping(value = "/listCoins", method = RequestMethod.GET)
    public String listCoins(Model model) {
        //Displays the objects
        model.addAttribute("amounts", AmountUtils.buildCoins());

        return "amount";
    }


}