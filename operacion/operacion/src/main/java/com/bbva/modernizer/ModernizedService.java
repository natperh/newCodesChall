Aquí te dejo la implementación equivalente en Java 17 puro:


import java.util.Scanner;

public class Suma {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado es " + resultado);
    }
}


Aquí te explico qué hace cada parte del código:

*   import java.util.Scanner;: Importamos la clase Scanner para leer la entrada del usuario.
*   public class Suma { ... }: Definimos la clase Suma que contendrá el método main.
*   public static void main(String args) { ... }: Definimos el método main que es el punto de entrada del programa.
*   Scanner scanner = new Scanner(System.in);: Creamos un objeto Scanner para leer la entrada del usuario.
*   System.out.print("Introduce el primer número: ");: Imprimimos un mensaje para pedir al usuario que introduzca el primer número.
*   int num1 = scanner.nextInt();: Leemos el primer número introducido por el usuario y lo almacenamos en la variable num1.
*   System.out.print("Introduce el segundo número: ");: Imprimimos un mensaje para pedir al usuario que introduzca el segundo número.
*   int num2 = scanner.nextInt();: Leemos el segundo número introducido por el usuario y lo almacenamos en la variable num2.
*   int resultado = num1 + num2;: Calculamos la suma de los dos números y la almacenamos en la variable resultado.
*   System.out.println("El resultado es " + resultado);: Imprimimos el resultado de la suma.

Espero que esto te ayude. Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar