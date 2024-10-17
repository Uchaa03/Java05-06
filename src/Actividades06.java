//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Actividades06 {
    // 1. esCapicua: Devuelve verdadero si el número es capicúa
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);  // Utilizamos la función voltea() implementada abajo
    }

    // 2. esPrimo: Devuelve verdadero si el número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 3. siguientePrimo: Devuelve el menor primo mayor al número dado
    public static int siguientePrimo(int numero) {
        numero++;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }

    // 4. potencia: Devuelve el resultado de base^exponente
    public static double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }

    // 5. digitos: Devuelve el número de dígitos de un número entero
    public static int digitos(int numero) {
        return String.valueOf(Math.abs(numero)).length();
    }

    // 6. voltea: Le da la vuelta a un número
    public static int voltea(int numero) {
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + (numero % 10);
            numero /= 10;
        }
        return invertido;
    }

    // 7. digitoN: Devuelve el dígito en la posición n (empezando por 0)
    public static int digitoN(int numero, int posicion) {
        String numeroStr = String.valueOf(Math.abs(numero));
        if (posicion >= 0 && posicion < numeroStr.length()) {
            return Character.getNumericValue(numeroStr.charAt(posicion));
        } else {
            return -1;  // Retorna -1 si la posición es inválida
        }
    }
}
