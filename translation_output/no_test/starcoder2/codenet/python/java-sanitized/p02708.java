import java.util.*;

public class p02708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += (((2 * n - i + 1) * i) / 2) - (i * (i - 1) / 2) + 1;
        }
        System.out.println(ans % (1000000000 + 7));
    }
}