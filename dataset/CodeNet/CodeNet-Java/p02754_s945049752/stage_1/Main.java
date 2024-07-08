import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = a + b;
        long mod = n % sum;
        long div = n / sum;
        System.out.println(div * a + Math.min(mod, a));
    }
}
