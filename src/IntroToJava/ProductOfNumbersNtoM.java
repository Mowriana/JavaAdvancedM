package IntroToJava;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        BigInteger sum = BigInteger.ONE;

        do {
            BigInteger number = new BigInteger("" + a);
            sum = sum.multiply(number);
            a++;;
        } while (a <= b);

        System.out.printf("product[%d..%d] = %d\n", a, b, sum);

    }
}
