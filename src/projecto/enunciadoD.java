package projecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yamir on 11/06/15.
 * Nombre: Yamir Gudiño
 * cedula: 8-905-48
 * problema D Parcial 4
 * profesor: Miguel Diaz
 */
public class enunciadoD {
    /*
    d) cree un programa que sume, reste, y multiplique dos arreglos
    de 5 elementos enteros cada uno. Haga uso de una estructura de
    condición switch para que el usuario pueda elegir que operación
    realizar con los arreglos, es decir, que escoja entre sumar, restar,
    multiplicar, y aplicarla todas ( se usa una matriz 5 x 3 llamada todas
    para generar cálculos de todas las operaciones a la vez de los dos arreglos).
    No olvide cargar previamente los arreglos según considere necesario.
     */
    int arr1 [] = new int [5];
    int arr2 [] = new int [5];
    int arr3 [] = new int [5];
    int matriz [] [] = new int [5][3];
    BufferedReader br = new BufferedReader (new
            InputStreamReader(System.in));

    public void arreglo1(){
        for (int x=0; x < arr1.length; x++) {
            try {
                System.out.println("Introduzca el elemento [" + (x+1)+"] del arreglo 1 ");
                String temp = br.readLine();
                arr1[x] = Integer.parseInt(temp);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
    public void arreglo2() {
        for (int x = 0; x < arr2.length; x++) {
            try {
                System.out.println("Introduzca el elemento [" + (x+1)+"] del arreglo 2 ");
                String temp = br.readLine();
                arr2[x] = Integer.parseInt(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void suma(){
        for (int x=0; x < arr3.length; x++) {
                arr3[x] =arr1[x]+arr2[x] ;
            System.out.println(arr1[x]+" + "+arr2[x]+" = "+arr3[x]);
        }
    }
    public void resta(){
        for (int x=0; x < arr3.length; x++) {
            arr3[x] =arr1[x]-arr2[x] ;
            System.out.println(arr1[x]+" - "+arr2[x]+" = "+arr3[x]);
        }
    }
    public void multi(){
        for (int x=0; x < arr3.length; x++) {
            arr3[x] =arr1[x]*arr2[x] ;
            System.out.println(arr1[x]+" * "+arr2[x]+" = "+arr3[x]);
        }
    }
    public void todas(){
        for (int y=0; y < matriz.length; y++)
         {
             if (y==0)
             System.out.println("***** Suma ******");
             if (y==1)
                 System.out.println("***** Resta ******");
             if (y==2)
                 System.out.println("***** Multiplicacion ******");
             for (int x=0; x < matriz.length; x++) {
                if (y==0){
                    matriz[x][y] = arr1[x]+arr2[x];
                    System.out.println(arr1[x]+" + "+arr2[x]+" = "+matriz[x][y]);
                }
                if(y==1){
                    matriz[x][y] = arr1[x]-arr2[x];
                    System.out.println(arr1[x]+" - "+arr2[x]+" = "+matriz[x][y]);
                }
                if(y==2){
                    matriz[x][y] = arr1[x]*arr2[x];
                    System.out.println(arr1[x]+" * "+arr2[x]+" = "+matriz[x][y]);
                    System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
                }
            }
        }
    }
    public static void main(String[]args){
        BufferedReader br = new BufferedReader (new
                InputStreamReader(System.in));
        enunciadoD uso = new enunciadoD();
        try {
            System.out.println("Que desea realizar: " );
            System.out.println(" 1 - Sumar");
            System.out.println(" 2 - Restar");
            System.out.println(" 3 - Multiplicar");
            System.out.println(" 4 - Todas las operaciones");
            System.out.println("teclee el numero con su opcion: ");
            String temp;
                temp = br.readLine();
            int x = Integer.parseInt(temp);
            switch (x)
            {
                case 1:
                {
                    System.out.println("***** Suma ******");
                    uso.arreglo1();
                    uso.arreglo2();
                    uso.suma();
                    break;
                    }
                case 2:
                {
                    System.out.println("***** Resta ******");
                    uso.arreglo1();
                    uso.arreglo2();
                    uso.resta();
                    break;
                }
                case 3:
                {
                    System.out.println("***** Multiplicacion ******");
                    uso.arreglo1();
                    uso.arreglo2();
                    uso.multi();
                    break;
                }
                case 4:
                {
                    System.out.println("***** Todas las operaciones ******");
                    uso.arreglo1();
                    uso.arreglo2();
                    uso.todas();
                    break;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
