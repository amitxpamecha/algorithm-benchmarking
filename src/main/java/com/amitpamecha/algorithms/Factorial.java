/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amitpamecha.algorithms;

/**
 *
 * @author apamecha
 */
final class Factorial {

    static long recursive(int number) {
        switch (checkValidNumber(number)) {
            case 0:
                return 1;
            default:
                return recursive(number - 1) * number;

        }
    }

    static long iterative(int number) {
        checkValidNumber(number);
        long result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    private static int checkValidNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return number;
    }
}
