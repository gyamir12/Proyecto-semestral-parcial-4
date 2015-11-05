package projecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yamir on 11/01/15.
 * Nombre: Yamir Gudiño
 * cedula: 8-905-48
 * problema a
 * profesor: Miguel Diaz
 */
public class encuadiadoA {
    /* a) crear un programa que sea capaz de determinar si un numero entero
           capturado desde el teclado es un numero: par o impar, si es un número
           primo o no primo, y  que determine si ese número es un número perfecto.
           (valor 10 puntos).
             */

    public static boolean esPar (int a){
        if ( a % 2 == 0 )
            return(true);

        return (false);
    }
    public static String letra (int l){

        if (esPar(l) == true)
            return ("El numero " +l+  " es Par");

        return ("El numero " +l+ " es Impar");
    }
    public static void main(String[] args){


        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String temp;
        int b;
        try {
            System.out.println("Introduzca un numero:");
            temp = br.readLine();
            b = Integer.parseInt(temp);
            System.out.println(letra(b));
            if (NumericUtil.isPrime(b)){
                System.out.println("El numero " +b+" es Primo ");
            }
            else
                System.out.println("El numero " +b + " no es Primo ");
            if (perfecto.perfect(b))
                System.out.println("El numero " +b+" es Perfecto ");
            else
                System.out.println("El numero " +b+" no es Perfecto ");

        }
        catch (Exception e) {
            System.out.println("Introduzca solo numeros ");

    }
}
}
class NumericUtil {
    /***
     * Returns a Boolean value if the numeric argument is prime.
     * @param number int
     * @return boolean True if numeric argument is prime
     */
    public static boolean isPrime(int number) {
        try {
            if (!(number > 0))
                throw new IllegalArgumentException("Error: Argument must be greater than zero.");

            if (number % number == 0 && number % 1 == 0) {
                if (number % 2 != 0)
                    return true;
            }
        }
        catch (IllegalArgumentException err) {
            err.printStackTrace();
        }

        return false;
    }
}

class perfecto {

    public static boolean perfect(int n) {
        int suma=0;
        for (int i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1
            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == n) {  // si el numero es igual a la suma de sus divisores es perfecto
            return true;
        } else {
            return false;
        }
    }
}
