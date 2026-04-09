Aquí te dejo un ejemplo de cómo podrías implementar un servicio en Spring Boot 3 que replique la lógica del programa COBOL que sumas dos números:

```java
import org.springframework.stereotype.Service;

@Service
public class SumaService {

    public int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
}
```

En este ejemplo, creamos un servicio llamado `SumaService` que tiene un método `sumar` que toma dos números enteros como parámetros y devuelve su suma.

Para interactuar con este servicio, podrías crear un controlador que reciba los números como parámetros y llame al servicio para realizar la suma. Aquí te dejo un ejemplo:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {

    @Autowired
    private SumaService sumaService;

    @GetMapping("/sumar")
    public String sumar(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int resultado = sumaService.sumar(num1, num2);
        return "El resultado es " + resultado;
    }
}
```

En este ejemplo, creamos un controlador llamado `SumaController` que tiene un método `sumar` que recibe dos números como parámetros y llama al servicio `SumaService` para realizar la suma. El resultado se devuelve como una cadena de texto.

Para probar este servicio, podrías utilizar una herramienta como Postman o cURL para enviar una solicitud GET a la URL `/sumar` con los números como parámetros. Por ejemplo:

```
GET /sumar?num1=2&num2=3
```

La respuesta debería ser:

```
El resultado es 5
```

Espero que esto te ayude. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!