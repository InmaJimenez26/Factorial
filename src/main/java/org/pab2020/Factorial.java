package org.pab2020;

/** Class to compue the factorial of an integer number */
public class Factorial {
    public int compute(int value) {
        int result;
        if (value < 0){
            throw new RuntimeException("Error: numero negativo: "+value);
        }
        else if ((value == 0) || (value == 1)) {
            result = 1;
        }
        else {
            result = value * compute(value-1);
        }

        return result;
    }


}

