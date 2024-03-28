import java.util.*;

public class p03362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[2000];
        int cnt = 0;
        for (int i = 2; i <= 2000; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                p[cnt++] = i;
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        for (int i = 0; i < cnt; i++) {
            if (p[i] % 10 == 1) {
                ans[idx++] = p[i];
            }
            if (idx == n) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}