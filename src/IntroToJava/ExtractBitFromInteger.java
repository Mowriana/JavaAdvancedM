package IntroToJava;

import java.util.Scanner;

public class ExtractBitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int position = scanner.nextInt();

        int mask = num >> position;
        //bitowete se chetut ot  dqsno nalqwo suotwetno wzimame poziciqta koqto ni trqbwa sus operatora >>
        //poweche poqsnenie slaid 47 na prezentaciq nomer 1
        int result = 1 & mask;
        System.out.println(result);

    }
}
