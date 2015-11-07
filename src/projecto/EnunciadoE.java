package projecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yamir on 11/07/15.
 * Nombre: Yamir Gudiño
 * cedula: 8-905-48
 * problema E
 * profesor: Miguel Diaz
 */
public class EnunciadoE {
    /*e) Escriba un programa que solicite al usuario que  ingrese un numero
    entero mayor de 9. Luego, el programa debe invertir el orden de presentación de los
    dígitos; es decir, que si el usuario ingresa 21 el programa debe presentarle en pantalla
    el numero 21 y su inverso 12. Tome en cuenta el caso de aquellos números que finalizan con el
    carácter (0 ). Asi por ejemplo, si el usuario introduce 5000, el programa debe imprimir como
    numero inverso 0005. (vale 12 puntos ).
     */
    public static String inReverse(String string) {
        if (string.length() <= 1)
            return string;

        return inReverse(string.substring(1, string.length())) + string.charAt(0);
    }
    public static void main (String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("ingrese un numero entero mayor que 9: ");
            String temp = br.readLine();
            int x = Integer.parseInt(temp);
            if (x < 9)
                throw new IllegalArgumentException("Number must be bigger than 9 / numero debe ser mayor a 9.");
            System.out.println(" "+inReverse(temp));
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        catch (IllegalArgumentException er){
            er.printStackTrace();
            System.out.println("el numero debe ser mayor a 9");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
