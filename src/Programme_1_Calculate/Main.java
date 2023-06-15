package Programme_1_Calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring a scanner object
      Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please first number :");
            int a = scanner.nextInt();
            System.out.println("Please second number :");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, / :");

            char symbol = scanner.next().charAt(0);
               Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Wou ld you like to do more calcul ation Please enter “ Y ”  :");//input wizard
               answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));

        scanner.close();
    }
}

