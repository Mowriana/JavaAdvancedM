package IntroToJava;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next("\\w+");
        String secondWord = scanner.next("\\w+");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();
        String thirdWord= scanner.nextLine();
        int sum = a+b+c;
        System.out.println(firstWord +" "+ secondWord +" "+ thirdWord +" "+ sum);
    }
}
