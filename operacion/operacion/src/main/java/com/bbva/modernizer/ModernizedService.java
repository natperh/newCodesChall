Aquí te dejo un ejemplo de cómo podrías implementar un servicio en Spring Boot 3 que realice la misma operación que el programa COBOL que proporcionaste:


@Service
public class ModernizedService {

    public int sumarNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
}


En este ejemplo, creamos una clase llamada ModernizedService y anotamos con @Service para indicar que es un servicio de Spring Boot. Luego, creamos un método llamado sumarNumeros que toma dos parámetros num1 y num2 de tipo int, y devuelve la suma de estos dos números.

Para utilizar este servicio, podrías crear un controlador que invoque al servicio y devuelva el resultado, por ejemplo:


@RestController
@RequestMapping("/api")
public class ModernizedService {

    @Autowired
    private ModernizedService modernizedService;

    @GetMapping("/sumar")
    public int sumarNumeros(@RequestParam int num1, @RequestParam int num2) {
        return modernizedService.sumarNumeros(num1, num2);
    }
}


En este ejemplo, creamos un controlador llamado ModernizedController y anotamos con @RestController para indicar que es un controlador de Spring Boot. Luego, creamos un método llamado sumarNumeros que toma dos parámetros num1 y num2 de tipo int mediante la anotación @RequestParam, y devuelve la suma de estos dos números invocando al servicio ModernizedService.

Para probar este servicio, podrías utilizar una herramienta como Postman o cURL para enviar una solicitud GET a la URL /api/sumar?num1=2&num2=3, por ejemplo. La respuesta debería ser 5.