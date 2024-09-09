
// Imports
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32; // Convert
        //System.out.print(celsius + " is " + fahrenheit + "farhenheit");
        System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);
        
        scanner.close();
    }
}


