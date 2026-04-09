Aquí te dejo el código del servicio en Java 17 utilizando Spring Boot 3:

```java
import org.springframework.stereotype.Service;

@Service
public class SumaService {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
```

Este servicio tiene un único método `sumar` que recibe dos números enteros como parámetros y devuelve su suma. La anotación `@Service` indica que esta clase es un servicio de la aplicación.

Si deseas crear un controlador para interactuar con este servicio, aquí te dejo un ejemplo:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {

    private final SumaService sumaService;

    @Autowired
    public SumaController(SumaService sumaService) {
        this.sumaService = sumaService;
    }

    @GetMapping("/sumar")
    public String sumar(@RequestParam int num1, @RequestParam int num2) {
        int resultado = sumaService.sumar(num1, num2);
        return "El resultado es " + resultado;
    }
}
```

Este controlador tiene un método `sumar` que recibe dos números enteros como parámetros de consulta y devuelve el resultado de la suma como una cadena de texto. La anotación `@RestController` indica que esta clase es un controlador de la aplicación, y la anotación `@Autowired` inyecta una instancia del servicio `SumaService` en el controlador.

Para probar este código, puedes crear una aplicación Spring Boot 3 y agregar las dependencias necesarias en el archivo `pom.xml` (si estás utilizando Maven) o `build.gradle` (si estás utilizando Gradle). Luego, puedes ejecutar la aplicación y acceder al endpoint `/sumar` con los números que desees sumar como parámetros de consulta.