import java.util.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int n = 512;
        int[] a = new int[n];
        int pattern = 0;
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / factorial(i) / factorial(7);
            a[i] = val;
        }
        Arrays.sort(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            int num = k / a[i];
            for (int j = 0; j < num; j++) {
                ans[i] += "L";
            }
            k %= a[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(ans[i]);
        }
        System.out.println(sb.toString());
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