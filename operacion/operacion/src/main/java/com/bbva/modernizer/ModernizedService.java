import java.util.Scanner;
public record Suma(int num1, int num2) {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
    }
}