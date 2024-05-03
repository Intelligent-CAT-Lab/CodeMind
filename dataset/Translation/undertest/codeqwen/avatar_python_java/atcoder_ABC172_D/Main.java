import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += (long) i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }

    static Scanner sc = new Scanner(System.in);
}