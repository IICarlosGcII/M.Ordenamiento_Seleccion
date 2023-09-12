import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nEelementos, pos, aux, min; //Instanciamos las variables junto con el arreglo correspondiente

        nEelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: ")); //Usamos ventanas emergentes para pedir datos
        arreglo = new int[nEelementos]; //Creamos el arreglo con la cantidad N de elementos ingresados

        for (int i = 0; i < nEelementos; i++) { //Pedimos y guardamos los datos dela arreglo mediante connsola
            System.out.println("Digite los numeros del arreglo: ");
            arreglo[i] = entrada.nextInt(); //Guardamos los datos en el arreglo mediante consola
        }
        //Metodo por Seleccion
        for (int i = 0; i < nEelementos; i++) { //Primer for
            min = i; //Insertamos el numero minimo para poder mapear
            for (int j = i+1; j < nEelementos; j++) { //Iniciamos el recorrido desde la siguiente posicion i+1
                if (arreglo[j] < arreglo[min]) { //Hacemos la logica, si la posicion actual es menor a la posicion del minimo
                    min = j; //Hacemos el cambio
                }
            }
            aux = arreglo[i]; //Realizamos el cambio igualando el aux al arrglo con posicion i
            arreglo[i] = arreglo[min]; //Cambiamo i por la posicion minima
            arreglo[min] = aux; //Volvemos a la posicion actual con el numero menor
        }
        System.out.println("\nArreglo de manera Creciente: "); //Mostramos el arreglo de manera Creciente
        for (int i = 0; i < nEelementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\nArreglo de manera Decreciente: "); //Mostramos el arreglo de manera Decreciente
        for (int i = (nEelementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}