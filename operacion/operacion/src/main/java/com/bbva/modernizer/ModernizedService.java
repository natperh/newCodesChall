Un programa en COBOL!

Aquí te dejo una posible implementación del mismo programa en Java 17, utilizando Spring Boot 3 como servicio:

**SumaService.java**
```java
@Service
public class SumaService {
  
  public int sumar(int num1, int num2) {
    return num1 + num2;
  }
}
```

**SumaController.java**
```java
@RestController
@RequestMapping("/suma")
public class SumaController {
  
  @Autowired
  private SumaService sumaService;
  
  @GetMapping
  public String sumar(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
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

Para ejecutar el servicio, puedes utilizar el comando `mvn spring-boot:run` (si estás utilizando Maven) o `gradle bootRun` (si estás utilizando Gradle).

Una vez que el servicio esté en ejecución, puedes acceder a él mediante una solicitud GET a `http://localhost:8080/suma?num1=2&num2=3`, por ejemplo. La respuesta debería ser "El resultado es 5".

Espero que esto te sea de ayuda. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!