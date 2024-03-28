import java.util.*;

public class p03097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((popCount(a ^ b) & 1) == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(Arrays.toString(f(n, a, b)));
        }
    }

    private static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) & 1);
        }
        return res;
    }

    private static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
            }
        }

        int[] res = new int[1 << m];
        res[0] = x;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) {
                int diff = i;
                break;
            }
        }
        int s = (x & ((1 << diff) - 1)) + (((x >> (diff + 1)) << diff) >> 1);
        int t = (y & ((1 << diff) - 1)) + (((y >> (diff + 1)) << diff) >> 1);
        int u = s ^ 1;
        int[] left = f(m - 1, s, u);
        int[] right = f(m - 1, u, t);
        int xBit = (x >> diff) & 1;
        int yBit = (y >> diff) & 1;
        for (int i = 0; i < left.length; i++) {
            left[i] = (left[i] & ((1 << diff) - 1)) + (diff << xBit) + (((left[i] >> diff) << diff) << 1);
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = (right[i] & ((1 << diff) - 1)) + (diff << yBit) + (((right[i] >> diff) << diff) << 1);
        }
        System.arraycopy(left, 0, res, 0, left.length);
        System.arraycopy(right, 0, res, left.length, right.length);
        return res;
    }
}