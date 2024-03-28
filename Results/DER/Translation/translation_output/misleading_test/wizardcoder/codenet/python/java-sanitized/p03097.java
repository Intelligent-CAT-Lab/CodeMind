import java.util.*;

public class p03097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int pop_count = 0;
        for (int i = 0; i < 17; i++) {
            pop_count += ((a>>i) & 1)!= ((b>>i) & 1);
        }
        if (pop_count % 2 == 0) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        int[] res = f(n, a, b);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
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

        int diff = 0;
        for (int i = 0; i < 17; i++) {
            if ((x>>i) & 1!= (y>>i) & 1) {
                diff = i;
                break;
            }
        }
        int s = (x % (1<<diff)) + (((x >> (diff+1)) * (1<<diff)) >> 1);
        int t = (y % (1<<diff)) + (((y >> (diff+1)) * (1<<diff)) >> 1);
        int u = s^1;
        int[] left = f(m-1, s, u);
        int[] right = f(m-1, u, t);

        int x_bit = (x>>diff) & 1;
        int y_bit = (y>>diff) & 1;
        for (int i = 0; i < left.length; i++) {
            left[i] = (left[i] % (1<<diff)) + ((1<<diff) * x_bit) + (((left[i] >> diff) * (1<<diff)) << 1);
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = (right[i] % (1<<diff)) + ((1<<diff) * y_bit) + (((right[i] >> diff) * (1<<diff)) << 1);
        }
        int[] res = new int[left.length + right.length];
        System.arraycopy(left, 0, res, 0, left.length);
        System.arraycopy(right, 0, res, left.length, right.length);
        return res;
    }
}