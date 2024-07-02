import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
System.out.println("[INST]5;x;scan.nextInt();"+x);
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}