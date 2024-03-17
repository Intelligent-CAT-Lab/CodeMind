import java.util.Scanner;

public class p03050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[count] = i;
                count++;
                if (i!= N / i) {
                    plist[count] = N / i;
                    count++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < count; i++) {
            int x = plist[i];
            int kari = (int) Math.floor(N / x) - 1;
            if (kari == 0) {
                continue;
            }
            int q = (int) Math.floor(N / kari);
            int r = N % kari;
            if (q == r) {
                ans += kari;
            }
        }
        System.out.println(ans);
    }
}