package projecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yamir on 11/05/15.
 * Nombre: Yamir Gudiño
 * cedula: 8-905-48
 * problema c
 * profesor: Miguel Diaz
 */
public class empleado {
    /*c) Crear una clase llamada Empleado que contenga como miembros atributos
    los datos nombre y numero de empleado; además, debe tener como miembro métodos
    uno llamado leerDatos, y otro denominado desplegarDatos. Debe leer los datos desde
    el teclado, y presentarlos por pantalla. (vale 10 puntos)
     */
    public String nombre;
        int NumeroDeEmpleado;
    public void leerDatos (String nom, int nde){
        nombre=nom;
        NumeroDeEmpleado=nde;
    }
    public void desplegarDatos() {
        System.out.println("Nombre: "+getNombre());
        String s = String.format("%08d",getNumeroDeEmpleado());
        System.out.println("Numero de empleado: "+s);

    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeEmpleado() {
        return NumeroDeEmpleado;
    }
    public static void main (String[]args) {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        empleado emp = new empleado();
        String temp;
        String temp2;
        int x;
        String ans;
        char rpta = 's';
        while (!(rpta =='n' || rpta == 'N')) {
            try {
                try {
                    System.out.print("Introduzca el nombre: ");
                    temp = br.readLine();
                    System.out.print("Introduzca el numero de empleado: ");
                    temp2 = br.readLine();
                    x = Integer.parseInt(temp2);
                    emp.leerDatos(temp, x);
                    emp.desplegarDatos();
                } catch (NumberFormatException e) {
                    System.out.println("Introduzca solo numeros enteros para el numero de empleado");
                }catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("presione cualquier letra para continuar o ,[N] No para finalizar : ");
                ans = br.readLine();
                rpta = ans.charAt(0);
            } catch (Exception er) {
                System.out.println()    ;
            }
        }


    }
}
