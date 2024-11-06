package org.example;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringCalculator {
     int callCount = 0;

    public int add(String number){
        callCount++;
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
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;
        for (String n : numArr) {
            int num = Integer.parseInt(n);
            if (num < 0) {

                negativeNumbers.add(num);
            }
            sum += num;
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }
        return sum;
    }

    public int GetCalledCount() {
        return callCount;
    }
}
