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
        do {
            numero++;
        } while (!esPrimo(numero));
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
    // 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero.
    public static int posicionDeDigito(int numero, int digito) {
        String numStr = Integer.toString(numero);
        int posicion = numStr.indexOf(Integer.toString(digito));
        return posicion != -1 ? posicion : -1;
    }

    // 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
    public static int quitaPorDetras(int numero, int digito) {
        return numero / (int) Math.pow(10, digito);
    }

    // 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
    public static int quitaPorDelante(int numero, int digito) {
        String numStr = Integer.toString(numero);
        if (digito >= numStr.length()) {
            return 0;
        }
        return Integer.parseInt(numStr.substring(digito));
    }

    // 11. pegaPorDetras: Añade un dígito a un número por detrás.
    public static int pegaPorDetras(int numero, int digito) {
        return Integer.parseInt(Integer.toString(numero) + digito);
    }

    // 12. pegaPorDelante: Añade un dígito a un número por delante.
    public static int pegaPorDelante(int numero, int digito) {
        return Integer.parseInt(digito + Integer.toString(numero));
    }

    // 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numStr = Integer.toString(numero);
        if (inicio < 0 || fin >= numStr.length() || inicio > fin) {
            throw new IllegalArgumentException("Posiciones no válidas.");
        }
        return Integer.parseInt(numStr.substring(inicio, fin + 1));
    }

    // 14. juntaNumeros: Pega dos números para formar uno.
    public static int juntaNumeros(int num1, int num2) {
        return Integer.parseInt(Integer.toString(num1) + Integer.toString(num2));
    }
    public static void main(String[] args) {
        // Probar las funciones
        System.out.println("Es capicúa (121): " + esCapicua(121));  // true
        System.out.println("Es primo (7): " + esPrimo(7));  // true
        System.out.println("Siguiente primo de 10: " + siguientePrimo(10));  // 11
        System.out.println("Potencia (2^3): " + potencia(2, 3));  // 8.0
        System.out.println("Dígitos en 12345: " + digitos(12345));  // 5
        System.out.println("Número volteado de 1234: " + voltea(1234));  // 4321
        System.out.println("Dígito en posición 2 de 12345: " + digitoN(12345, 2));  // 3
        System.out.println("Posición del dígito 5 en el número 123456: " + posicionDeDigito(123456, 5));  // 4
        System.out.println("Quitar 2 dígitos por detrás del número 123456: " + quitaPorDetras(123456, 2));  // 1234
        System.out.println("Quitar 3 dígitos por delante del número 123456: " + quitaPorDelante(123456, 3));  // 456
        System.out.println("Pegar el dígito 7 por detrás del número 1234: " + pegaPorDetras(1234, 7));  // 12347
        System.out.println("Pegar el dígito 9 por delante del número 1234: " + pegaPorDelante(1234, 9));  // 91234
        System.out.println("Trozo del número 123456 desde la posición 1 hasta la 3: " + trozoDeNumero(123456, 1, 3));  // 234
        System.out.println("Juntar los números 123 y 456: " + juntaNumeros(123, 456));  // 123456
    }
}
