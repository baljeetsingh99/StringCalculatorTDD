package org.example;

public class StringCalculator {

    public int add(String number){
        if(number.isEmpty()){
            return 0;
        }
        String[] numArr = number.split(",");
        int sum = 0;
        for (String n : numArr) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}
