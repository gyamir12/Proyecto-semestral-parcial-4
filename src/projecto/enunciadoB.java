package projecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yamir on 11/04/15.
 * Nombre: Yamir Gudiño
 * cedula: 8-905-48
 * problema b
 * profesor: Miguel Diaz
 */
public class enunciadoB {

    public static void main(String[] args) {
        /*  b) Escribe un programa que lea 2 valores enteros que el usuario debe
            introducir para calcular la resistencia, llamada R. Debe leer un valor
            entero llamado I que representará los amperios, y una variable V que
            representará el voltaje. ( vale 8 puntos).

            La resistencia se manejara en ohms por lo que la formula para calcular la resistencia es:

                    R= V/I
         */
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));


        String ans;
        char rpta = 's';
        while ((rpta == 's') | (rpta == 'S')) {
        try{

            try {
                String temp, temp2;
                int I, V, R;
                System.out.print("Introduzca el valor para los amperios [I]: ");
                temp = br.readLine();
                I = Integer.parseInt(temp);
                if (I==0)
                    throw new IllegalArgumentException("Error: I can't be zero, i no puede ser cero.");//sirve para crear un error
                System.out.print("Introduzca el valor para el voltaje [V]: ");
                temp2 = br.readLine();
                V = Integer.parseInt(temp2);
                R = V / I;
                System.out.println("la resistencia [R] es de: " + R);

            }
            catch (NumberFormatException e) {
                System.out.println("error, Introduzca solo numeros enteros");
                e.printStackTrace();}
            catch (IllegalArgumentException err) {
                err.printStackTrace();
                System.out.println("error, I no puede ser cero");
            }


            catch (Exception e) {
                System.out.println("error, Introduzca valores numericos, para realizar el calculo nuevamente. ");
                e.printStackTrace();//sirve para ver los errores que tiran

            }
            System.out.println("presione [S] si para continuar o [N] No para cancelar : ");
            ans = br.readLine();
            rpta = ans.charAt(0);
            while (!(rpta =='s' || rpta =='S' || rpta =='n' || rpta == 'N')){
                System.out.println("Escriba solo, si o no para continuar: "  );
                ans = br.readLine();
                rpta = ans.charAt(0);
            }}catch (Exception er) {
            System.out.println(" ");
            er.printStackTrace();
        }

    }
}
}