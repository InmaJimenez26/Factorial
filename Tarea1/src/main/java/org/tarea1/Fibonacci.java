package org.tarea1;

public class Fibonacci {
    // La formula que voy a emplear es F(n) = F(n-1) + k*F(n-2)
    public int compute(int n, int k) {
        int resultado;
        int uno = 1; //F(n-1)
        int dos = 1; //F(n-2)

        if (n < 0 || k < 0){
            throw new RuntimeException("Error: numero negativo: ");
        }
        if (n == 0 || n == 1 || n == 2){ //si no pasa ningun mes, nos quedamos con la pareja inicial
            resultado = 1;
        }

        else{
            resultado = 0;
        }
        for (int i=2; i<n; i++){
            resultado = uno + k*dos;
            dos = uno;
            uno = resultado;
        }

        return resultado;
    }
}
