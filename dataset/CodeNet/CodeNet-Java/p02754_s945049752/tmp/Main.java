import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
        long a = sc.nextLong();
System.out.println("[INST]6;a;sc.nextLong();"+a);
        long b = sc.nextLong();
System.out.println("[INST]7;b;sc.nextLong();"+b);
        long sum = a + b;
        long mod = n % sum;
        long div = n / sum;
        System.out.println(div * a + Math.min(mod, a));
    }
}
