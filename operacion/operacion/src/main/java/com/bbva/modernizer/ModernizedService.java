Aquí te dejo la implementación de la clase ModernizedService en Java 17, utilizando Spring Boot 3, que realiza la misma función que el programa COBOL que proporcionaste:


@Service
public class ModernizedService {

    public int sumarNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public void ejecutarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        int resultado = sumarNumeros(num1, num2);
        System.out.println("El resultado es " + resultado);
    }
}


En esta implementación, la clase ModernizedService tiene un método sumarNumeros que toma dos números enteros como parámetros y devuelve su suma. El método ejecutarSuma utiliza un Scanner para leer los números introducidos por el usuario, llama al método sumarNumeros para calcular la suma y luego imprime el resultado.

Puedes llamar al método ejecutarSuma desde un controlador o desde una clase de prueba para ejecutar la suma.

Recuerda que, al ser una aplicación Spring Boot, debes configurar el proyecto correctamente y crear un controlador o una clase de prueba para llamar al servicio. Por ejemplo:


@RestController
@RequestMapping("/suma")
public class ModernizedService {

    @Autowired
    private ModernizedService modernizedService;

    @GetMapping
    public void ejecutarSuma() {
        modernizedService.ejecutarSuma();
    }
}


De esta manera, puedes acceder al servicio mediante una petición GET a la URL /suma.