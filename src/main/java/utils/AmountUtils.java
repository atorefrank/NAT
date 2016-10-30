package utils;

import com.nat.model.Amount;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by francisatore on 10/29/16.
 */
public class AmountUtils {

    private static LinkedHashSet<Amount> amounts = new LinkedHashSet<Amount>();

    public static LinkedHashSet<Amount> buildCoins() {
        //Seed values
        if (amounts.isEmpty()){
            Amount amount1 = new Amount();
            amount1.setAmountId(1L);
            amount1.setValue(91.64);


            amounts.add(amount1);

        }

        return amounts;
    }

}
