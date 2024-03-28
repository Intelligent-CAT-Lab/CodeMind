import java.util.*;
import java.math.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.factorial(7 + i) / Math.factorial(i) / Math.factorial(7));
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            while (cnt >= a[i]) {
                ans[i] += "L";
                cnt -= a[i];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
    }
}