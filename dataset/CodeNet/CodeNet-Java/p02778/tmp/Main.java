import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);

        for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]7;None;s.length();"+s.length());
            System.out.print("x");
        }

    }
}