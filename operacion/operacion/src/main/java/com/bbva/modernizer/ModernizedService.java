Aquí te dejo un ejemplo de cómo podrías implementar el servicio ModernizedService en Spring Boot 3, utilizando Java 17, para realizar la suma de dos números:


@Service
public class ModernizedService {

    public int sumarNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
}


En este ejemplo, la clase ModernizedService está anotada con @Service, lo que indica que es un servicio de Spring Boot. El método sumarNumeros toma dos parámetros int (num1 y num2) y devuelve la suma de ambos.

Si deseas que el servicio tenga una lógica más similar a la del programa COBOL original, podrías agregar una capa de entrada y salida de datos, por ejemplo, utilizando Scanner para leer los números desde la consola:


@Service
public class ModernizedService {

    public void sumarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);
    }
}


En este caso, el método sumarNumeros no devuelve nada (void) y en su lugar, imprime el resultado directamente en la consola.

Recuerda que, en un proyecto Spring Boot real, es probable que desees utilizar una capa de controlador para manejar las solicitudes HTTP y delegar la lógica de negocio a servicios como este.