Aquí te dejo un ejemplo de cómo podrías implementar un servicio de Spring Boot 3 que replique la lógica del programa COBOL que sumas dos números:

**SumaService.java**
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
**SumaController.java**
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

    @GetMapping("/suma")
    public String suma(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int resultado = sumaService.sumar(num1, num2);
        return "El resultado es " + resultado;
    }
}
```
**application.properties**
```properties
server.port=8080
```
**pom.xml** (si estás utilizando Maven)
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```
**build.gradle** (si estás utilizando Gradle)
```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
}
```
En este ejemplo, creamos un servicio `SumaService` que tiene un método `sumar` que recibe dos números enteros y devuelve su suma. Luego, creamos un controlador `SumaController` que utiliza el servicio para realizar la suma y devuelve el resultado como una cadena.

Para probar el servicio, puedes ejecutar la aplicación y acceder a la URL `http://localhost:8080/suma?num1=2&num2=3` en tu navegador. Deberías ver el resultado "El resultado es 5".

Ten en cuenta que, a diferencia del programa COBOL original, este servicio no solicita la entrada del usuario de manera interactiva. En su lugar, se espera que los números sean pasados como parámetros en la URL. Si deseas implementar una interfaz de usuario interactiva, podrías considerar utilizar una tecnología como Thymeleaf o Angular para crear una aplicación web que interactúe con el servicio.