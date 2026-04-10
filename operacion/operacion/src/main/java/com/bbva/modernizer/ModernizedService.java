import java.util.Scanner;
public record Suma(int num1, int num2) {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
    }
}
Si deseas utilizar Spring Boot 3, puedes crear un proyecto con la siguiente estructura:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SumaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SumaApplication.class, args);
    }
}
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SumaController {
    public String suma(@RequestParam int num1, @RequestParam int num2) {
        int resultado = num1 + num2;
    }
}