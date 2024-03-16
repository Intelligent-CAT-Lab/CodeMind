import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= p; i++) {
            int cnt = 0;
            while (p % i == 0) {
                cnt++;
                p /= i;
            }
            if (cnt >= n) {
                ans *= (int) Math.pow(i, cnt / n);
            }
        }
        System.out.println(ans);
    }
}