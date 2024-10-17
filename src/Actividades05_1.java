//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Actividades05_1 {
    public static void Ejercicio01() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");  // El tabulador "\t" para que coja forma de tabla
            }
            System.out.println();  // Para hacer las filas
        }
    }

    public static void Ejercicio02() {
        //Creamos el array
        int[][] array = new int[4][5];
        Scanner sc = new Scanner(System.in);

        //En el bucle recorremos y almacenamos los valores a la vez en el array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce número para la posición [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        // Suma de filas y columnas para calcular el total
        int[] sumasFilas = new int[4];   // Sumas de las filas
        int[] sumasColumnas = new int[5]; // Sumas de las columnas
        int sumaTotal = 0;

        // Mostrar la tabla con las sumas parciales
        System.out.println("\nTabla con las sumas parciales (como hoja de cálculo):");

        // Recorrer el array y calcular las sumas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t");  // Mostrar los elementos
                sumasFilas[i] += array[i][j];           // Sumar fila
                sumasColumnas[j] += array[i][j];        // Sumar columna
                sumaTotal += array[i][j];               // Sumar al total
            }
            System.out.print(" | " + sumasFilas[i]);     // Mostrar suma de la fila
            System.out.println();  // Salto de línea
        }

        // Mostrar la línea divisoria
        System.out.println("---------------------------------");

        // Mostrar las sumas de las columnas y la suma total
        for (int j = 0; j < 5; j++) {
            System.out.print(sumasColumnas[j] + "\t");  // Mostrar suma de columna
        }
        System.out.println("| " + sumaTotal);  // Mostrar la suma total en la esquina inferior derecha
    }

    public static void main(String[] args) {
        Ejercicio01();
        Ejercicio02();
    }

}
