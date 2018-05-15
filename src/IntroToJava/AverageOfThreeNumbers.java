package IntroToJava;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1= scanner.nextDouble();
        double number2= scanner.nextDouble();
        double number3= scanner.nextDouble();
        scanner.nextLine();
        double avg = (number1+number2+number3)/3;

        System.out.printf("%.2f", avg);

    }
}
