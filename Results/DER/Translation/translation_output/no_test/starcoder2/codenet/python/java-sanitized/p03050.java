import java.util.Scanner;
import java.lang.Math;

public class p03050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int)Math.sqrt(N);
        int[] plist = new int[n];
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (N % j == 0) {
                plist[i] = j;
                i++;
                if (j != N / j) {
                    plist[i] = N / j;
                    i++;
                }
            }
        }
        int ans = 0;
        for (int j = 0; j < i; j++) {
            int x = plist[j];
            int kari = N / x - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}