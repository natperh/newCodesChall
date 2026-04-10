Aquí te dejo la traducción del código COBOL a Java 21 utilizando Spring Boot 3 y sintaxis moderna:


import java.util.Scanner;

public record Suma(int num1, int num2) {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado es " + resultado);
    }
}


Nota que en Java no es necesario definir explícitamente la longitud de los campos numéricos como en COBOL, ya que los tipos de datos `int` y `long` tienen una longitud fija. Además, no es necesario utilizar la palabra clave `STOP RUN` para finalizar el programa, ya que en Java el programa termina automáticamente cuando se ejecuta el método `main`.

También es importante destacar que en este ejemplo se utiliza la clase `Scanner` para leer la entrada del usuario, que es una forma más moderna y segura de leer la entrada del usuario en comparación con la función `ACCEPT` de COBOL.

Si deseas utilizar Spring Boot 3, puedes crear un proyecto con la siguiente estructura:


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SumaApplication.class, args);
    }
}


Y luego crear un controlador que maneje la lógica de la suma:


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {
    @GetMapping("/suma")
    public String suma(@RequestParam int num1, @RequestParam int num2) {
        int resultado = num1 + num2;
        return "El resultado es " + resultado;
    }
}


En este caso, puedes acceder a la suma mediante una solicitud GET a la URL `/suma?num1=2&num2=3`, por ejemplo.