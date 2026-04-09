Un programa en COBOL

Aquí te dejo una posible implementación del mismo programa en Java utilizando Spring Boot 3:

import org.springframework.stereotype.Service;

@Service
public class ModernizedService {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }
}


Y aquí te dejo un ejemplo de cómo podrías crear un controlador para interactuar con el servicio:

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModernizedService {

    @Autowired
    private SumaService sumaService;

    @GetMapping("/suma")
    public String suma(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int resultado = sumaService.suma(num1, num2);
        return "El resultado es " + resultado;
    }
}


En este ejemplo, el servicio SumaService se encarga de realizar la suma de dos números enteros. El controlador SumaController utiliza el servicio para realizar la suma y devuelve el resultado como una cadena de texto.

Para probar el servicio, puedes utilizar una herramienta como Postman o cURL para enviar una solicitud GET a la URL /suma con los parámetros num1 y num2 en la URL. Por ejemplo:

GET /suma?num1=2&num2=3


La respuesta debería ser:

El resultado es 5


Espero que esto te sea de ayuda. Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar