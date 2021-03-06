package org.pab2020;
//Inmaculada Jimenez Palomino
/** Class to compue the factorial of an integer number */
public class Factorial {
    public int compute(int value) {
        int result = 0;
        if (value < 0) {
            throw new RuntimeException("Error: numero negativo: " + value);
        } else if ((value == 0) || (value == 1)) {
            result = 1;

        } else {
            //de forma recursiva es:
            result = value * compute(value - 1);
            //forma iterativa
            //result = 1;
            //int i = 1;
            //while(i<=value){
            //result*=i;
            //i++;
            //}
        }
        return result;
    }
    

}

