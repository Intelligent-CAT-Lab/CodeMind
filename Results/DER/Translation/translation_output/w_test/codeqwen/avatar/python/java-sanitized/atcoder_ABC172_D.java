import java.util.*;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; i++) {
            long x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }
}