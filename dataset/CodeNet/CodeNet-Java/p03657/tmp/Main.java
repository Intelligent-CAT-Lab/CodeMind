import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}