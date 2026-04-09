Aquí te dejo un ejemplo de cómo podrías implementar el servicio ModernizedService en Spring Boot 3, utilizando Java puro, para realizar la suma de dos números:


@Service
public class ModernizedService {

    public int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
}


En este ejemplo, la clase ModernizedService está anotada con @Service, lo que indica que es un servicio de Spring Boot. El método sumar toma dos parámetros int (num1 y num2) y devuelve la suma de ambos.

Si deseas que el servicio tenga una interfaz más parecida a la del programa COBOL original, podrías agregar un método que solicite los números al usuario y luego llame al método sumar para realizar la operación. Por ejemplo:


@Service
public class ModernizedService {

    public int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        int resultado = sumar(num1, num2);
        System.out.println("El resultado es " + resultado);
    }
}


En este ejemplo, el método realizarSuma utiliza un Scanner para leer los números del usuario y luego llama al método sumar para realizar la operación. El resultado se imprime en la consola.

Recuerda que, en un proyecto Spring Boot real, probablemente querrás inyectar el servicio en un controlador o en otro componente para utilizarlo. Por ejemplo:


@RestController
public class ModernizedService {

    @Autowired
    private ModernizedService modernizedService;

    @GetMapping("/sumar")
    public String sumar(@RequestParam int num1, @RequestParam int num2) {
        int resultado = modernizedService.sumar(num1, num2);
        return "El resultado es " + resultado;
    }
}


En este ejemplo, el controlador MiControlador inyecta el servicio ModernizedService y utiliza su método sumar para realizar la operación. El resultado se devuelve como una cadena en la respuesta HTTP.