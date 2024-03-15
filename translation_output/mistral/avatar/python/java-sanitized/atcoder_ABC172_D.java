import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC172_D {
    static int mod = 1000000007;
    static double inf = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }
}