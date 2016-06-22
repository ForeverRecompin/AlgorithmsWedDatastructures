package com.nocom.algorithms.math;

/**
 * Created by fraj on 6/22/16 at 11:38 PM.
 */
public class GCD {
    public static <T extends Number> double getGCD(T numberA, T numberB) {
        double remainder, firstNumber, secondNumber;
        firstNumber = numberA.doubleValue();
        secondNumber = numberB.doubleValue();

        while (firstNumber != 0 && secondNumber != 0) {
            remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }
        return (firstNumber + secondNumber);
    }
}
