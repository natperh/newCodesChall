// Programa de suma en Java

// Clase principal
public class Suma {
    // Método principal
    public static void main(String[] args) {
        // Variables para almacenar los números introducidos por el usuario
        int num1, num2;
        // Variable para almacenar el resultado de la suma
        int resultado;

        // Mostrar mensaje solicitando el primer número
        System.out.print("Introduce el primer número: ");
        // Leer el primer número introducido por el usuario
        num1 = Integer.parseInt(System.console().readLine());

        // Mostrar mensaje solicitando el segundo número
        System.out.print("Introduce el segundo número: ");
        // Leer el segundo número introducido por el usuario
        num2 = Integer.parseInt(System.console().readLine());

        // Realizar la suma de los dos números
        resultado = num1 + num2;

        // Mostrar el resultado de la suma
        System.out.println("El resultado es " + resultado);
    }
}