package org.example;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String number){
        if(number.isEmpty()){
            return 0;
        }
        String defaultDeli = ",|\n";
        if (number.startsWith("//")) {
            int delimiterIndex = number.indexOf("\n");
            defaultDeli = Pattern.quote(number.substring(2, delimiterIndex));
            number = number.substring(delimiterIndex + 1);
        }
        String[] numArr = number.split(defaultDeli);
        int sum = 0;
        for (String n : numArr) {
            if(!n.isEmpty()){
                int num = Integer.parseInt(n);
                sum += num;
            }

        }

        return sum;
    }
}
