import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
System.out.println("[INST]7;a;scanner.next();"+a);
        int marbles = 0;
        for (int i = 0; i < a.length(); i++) {
System.out.println("[INST]9;None;a.length();"+a.length());
            if (a.charAt(i) == '1')marbles++;
System.out.println("[INST]10;None;a.charAt(i);"+a.charAt(i));
        }
        System.out.println(marbles);
    }
}
