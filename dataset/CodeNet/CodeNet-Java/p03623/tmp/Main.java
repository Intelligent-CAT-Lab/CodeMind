import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
System.out.println("[INST]4;x;sc.nextInt();"+x);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        if (Math.abs(x-a) < Math.abs(x-b)) {
System.out.println("[INST]7;None;Math.abs(x-a);"+Math.abs(x-a));
System.out.println("[INST]7;None;Math.abs(x-b);"+Math.abs(x-b));
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}