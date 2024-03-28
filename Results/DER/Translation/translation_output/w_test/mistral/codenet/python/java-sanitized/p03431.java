import java.util.*;

public class p03431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        long p = 998244353;
        List<Integer> f = new ArrayList<>();
        f.add(1);
        for (int i = 1; i <= k; i++) {
            f.add(-(~i * f.get(i) % p));
        }
        long ans = 0;
        for (int i = 1; i <= n - 1; i++) {
            ans += (f.get(i) * f.get(i + k) * f.get(i + k - 1) * f.get(i + k - 2)) % p;
        }
        System.out.println(ans % p);
    }
}