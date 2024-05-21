import java.util.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int n = 512;
        int pattern = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / factorial(i) / factorial(7);
            a[i] = val;
        }
        Arrays.reverse(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            ans[i] += String.join("", Collections.nCopies(k / a[i], "L"));
            k %= a[i];
        }
        Arrays.reverse(ans);
        System.out.println(String.join("", ans));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}