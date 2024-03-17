import java.util.*;

public class p03362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[2000];
        int[] ans = new int[n];
        int cnt = 0;
        for (int i = 2; i < 2000; i++) {
            if (p[i] == 0) {
                p[i] = i;
                ans[cnt++] = i;
                if (cnt == n) break;
            }
            for (int j = 0; j < cnt; j++) {
                if (p[i]!= 0) break;
                if (i % p[j] == 0) {
                    p[i] = p[j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}