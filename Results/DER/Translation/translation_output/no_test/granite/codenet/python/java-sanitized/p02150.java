import java.util.*;

public class p02150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long d = a - b;
        long n = Math.max(0, (x - b) / d);
        long ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}