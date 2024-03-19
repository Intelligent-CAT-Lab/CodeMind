import java.util.*;
public class p03050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[n];
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[i - 1] = i;
                if (i!= N / i) {
                    plist[n - 1] = N / i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = plist[i];
            int kari = (int) (N / x) - 1;
            if (kari == 0) {
                continue;
            }
            int q = (int) (N / kari);
            int r = N % kari;
            if (q == r) {
                ans += kari;
            }
        }
        System.out.println(ans);
    }
}