import java.util.Arrays;
import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        int n = 0;
        int m = 0;
        int[][] ans = new int[0][3];
        for (int d = 0; d < 30; d++) {
            if (2 << d <= l) {
                n = d + 1;
                m = 2 * d;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            ans = Arrays.copyOf(ans, ans.length + 1);
            ans[ans.length - 1] = new int[] {i, i + 1, 0};
            ans[ans.length - 1] = new int[] {i, i + 1, 2 << (i - 1)};
        }
        while (l > 2 << d) {
            for (int i = n - 1; i >= 0; i--) {
                if (l - 2 << (i - 1) > 2 << d - 1) {
                    ans = Arrays.copyOf(ans, ans.length + 1);
                    ans[ans.length - 1] = new int[] {i, n, l - 2 << (i - 1)};
                    m += 1;
                    l -= 2 << (i - 1);
                    break;
                }
            }
        }
        System.out.println(n, m);
        for (int[] a : ans) {
            System.out.println(a[0], a[1], a[2]);
        }
    }
}