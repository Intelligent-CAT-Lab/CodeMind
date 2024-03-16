import java.util.*;

public class p03097 {
    static int n, a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        if (popCount(a ^ b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> res = f(n, a, b);
            for (int i : res) {
                System.out.print(i + " ");
            }
        }
    }

    static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) & 1);
        }
        return res;
    }

    static List<Integer> f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return Arrays.asList(0, 1);
            } else {
                return Arrays.asList(1, 0);
            }
        }

        List<Integer> res = new ArrayList<>();
        res.add(x);
        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) {
                diff = i;
                break;
            }
        }
        int s = (x % (1 << diff)) + (((x >> (diff + 1)) * (1 << diff)) >> 1);
        int t = (y % (1 << diff)) + (((y >> (diff + 1)) * (1 << diff)) >> 1);
        int u = s ^ 1;
        List<Integer> left = f(m - 1, s, u);
        List<Integer> right = f(m - 1, u, t);
        int x_bit = (x >> diff) & 1, y_bit = (y >> diff) & 1;
        for (int l : left) {
            res.add(l % (1 << diff) + (1 << diff) * x_bit + (((l >> diff) * 1 << diff) << 1));
        }
        for (int r : right) {
            res.add(r % (1 << diff) + (1 << diff) * y_bit + (((r >> diff) * 1 << diff) << 1));
        }
        return res;
    }
}