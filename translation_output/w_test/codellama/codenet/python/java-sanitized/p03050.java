import java.util.Scanner;
import java.lang.Math;

public class p03050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[n];
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[i] = i;
                if (i != N / i) {
                    plist[i] = N / i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < plist.length; i++) {
            int x = plist[i];
            int kari = (int) (N / x) - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = (int) (N / kari);
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}