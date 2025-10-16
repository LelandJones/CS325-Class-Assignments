import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * lab6.java
 * fall 2025
 * 
 * Leland Jones
 * 
 * convert String to double using Java Collection Stack and Queue
 */

public class lab6 {
    public static void main(String[] args) {

        // test cases - add x3 additional cases here
        test("6", 6.0);
        test("7,000,000", 7000000.0);
        test(" $$$7 000 000 ", 7000000.0);
        test("$5,678.13 ", 5678.13);
        test("$0.25", 0.25);
        test(" -$.25", -0.25);
        test("-8.96", -8.96);

        // *** add three additional test cases here
        test("321.004", 321.004);
        test(" -$12,543.67 ", -12543.67);
        test(" 999.99 ", 999.99);

    }// main

    private static double toDouble(String a) {

        double answer = 0.0;

        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        boolean decimalFound = false; // *** may or may not use this approach
        boolean negative = false; // *** may or may not use this approach

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '-') {
                negative = true;
            }
        }

        for (int i = 0; i < a.length(); i++) {

            char c = a.charAt(i);

            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);

                if (decimalFound == false) {
                    s.push(digit);
                } else {
                    q.add(digit);
                }

            } else if (c == '.') {
                decimalFound = true;
            }
        }

        double placeValue = 1.0;
        while (s.isEmpty() == false) {
            int digit = s.pop();
            answer = answer + (digit * placeValue);
            placeValue = placeValue * 10;
        }

        double decimalValue = 0.0;
        double divisor = 10.0;
        while (q.isEmpty() == false) {
            int digit = q.remove();
            decimalValue = decimalValue + (digit / divisor);
            divisor = divisor * 10;
        }

        answer = answer + decimalValue;

        if (negative == true) {
            answer = -answer;
        }

        return answer;

    }// toDouble

    // test method
    private static void test(String s, double expected) {

        double actual = toDouble(s);

        if (actual == expected)
            System.out.printf("Passed: %15s => %15f\n", s, actual);
        else
            System.out.printf(" Error: %15s => %15f   Expected: %15f\n", s, actual, expected);

    } // test

}// class
