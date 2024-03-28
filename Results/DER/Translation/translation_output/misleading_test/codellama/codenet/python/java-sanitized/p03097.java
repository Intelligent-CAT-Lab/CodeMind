import java.util.Scanner;

public class p03097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int popCount = popCount(a ^ b);
        if (popCount % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int[] result = f(n, a, b);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

    private static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) % 2 == 1) ? 1 : 0;
        }
        return res;
    }

    private static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[] { 0, 1 };
            } else {
                return new int[] { 1, 0 };
            }
        }

        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            if ((x >> i) % 2 != (y >> i) % 2) {
                int diff = i;
                break;
            }
        }
        int s = (x % (2 << diff)) + ((x / (2 << (diff + 1))) * 2 << (diff + 1)) >> 1;
        int t = (y % (2 << diff)) + ((y / (2 << (diff + 1))) * 2 << (diff + 1)) >> 1;

        int u = s ^ 1;
        int[] left = f(m - 1, s, u);
        int[] right = f(m - 1, u, t);

        int x_bit = (x >> diff) % 2;
        int y_bit = (y >> diff) % 2;

        for (int i = 0; i < left.length; i++) {
            left[i] = left[i] % (2 << diff) + (2 << diff) * x_bit + ((left[i] / (2 << diff)) * 2 << diff) << 1;
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = right[i] % (2 << diff) + (2 << diff) * y_bit + ((right[i] / (2 << diff)) * 2 << diff) << 1;
        }

        return left + right;
    }
}