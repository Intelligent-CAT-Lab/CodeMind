import java.util.*;

public class p03097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ans = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (((a >> i) & 1)!= ((b >> i) & 1)) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int m = n;
            int x = a;
            int y = b;
            for (int i = 0; i < m; i++) {
                if (((x >> i) & 1)!= ((y >> i) & 1)) {
                    int diff = i;
                    break;
                }
            }
            int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
            int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
            int u = s ^ 1;
            int[] left = f(m - 1, s, u);
            int[] right = f(m - 1, u, t);
            int x_bit = (x >> diff) & 1;
            int y_bit = (y >> diff) & 1;
            for (int i = 0; i < left.length; i++) {
                ans[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] / (1 << diff)) * (1 << diff)) << 1);
            }
            for (int i = 0; i < right.length; i++) {
                ans[i + left.length] = (right[i] % (1 << diff)) + (1 << diff) * y_bit + (((right[i] / (1 << diff)) * (1 << diff)) << 1);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }

    public static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
            }
        }
        int[] res = new int[1 << m];
        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1)!= ((y >> i) & 1)) {
                diff = i;
                break;
            }
        }
        int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int u = s ^ 1;
        int[] left = f(m - 1, s, u);
        int[] right = f(m - 1, u, t);
        int x_bit = (x >> diff) & 1;
        int y_bit = (y >> diff) & 1;
        for (int i = 0; i < left.length; i++) {
            res[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] / (1 << diff)) * (1 << diff)) << 1);
        }
        for (int i = 0; i < right.length; i++) {
            res[i + left.length] = (right[i] % (1 << diff)) + (1 << diff) * y_bit + (((right[i] / (1 << diff)) * (1 << diff)) << 1);
        }
        return res;
    }
}