package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // Test cases for add() method
        try {
            System.out.println("Result for empty string: " + calculator.add(""));
            System.out.println("Result for '1': " + calculator.add("1"));
            System.out.println("Result for '9': " + calculator.add("9"));
            System.out.println("Result for '5,9': " + calculator.add("5,9"));
            System.out.println("Result for '2,7': " + calculator.add("2,7"));
            System.out.println("Result for '1,2,3,4': " + calculator.add("1,2,3,4"));
            System.out.println("Result for '1\\n5,7': " + calculator.add("1\n5,7"));
            System.out.println("Result for '1\\n4\\n7,4': " + calculator.add("1\n4\n7,4"));
            System.out.println("Result for '//;\\n1;2': " + calculator.add("//;\n1;2"));
            System.out.println("Result for '//|\\n2|3|3': " + calculator.add("//|\n2|3|3"));


            try {
                System.out.println("Result for '1,-2,3,-4': " + calculator.add("1,-2,3,-4"));
            } catch (Exception e) {
                System.out.println("Exception for negative numbers: " + e.getMessage());
            }

            System.out.println("Total calls to add(): " + calculator.GetCalledCount());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}