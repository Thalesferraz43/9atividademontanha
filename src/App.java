import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double c, f; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite a temperatura em Fahrenheit: ");
        f = sc.nextDouble();
        c = 5 * ((f-32)/9);
        System.out.printf("A temperatura em Celsius é : %.2f °C", c);
    }
}