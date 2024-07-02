import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        double t = sc.nextInt();
System.out.println("[INST]6;t;sc.nextInt();"+t);
        int r = sc.nextInt();
System.out.println("[INST]7;r;sc.nextInt();"+r);
        System.out.println(t / a * r);
    }
}
