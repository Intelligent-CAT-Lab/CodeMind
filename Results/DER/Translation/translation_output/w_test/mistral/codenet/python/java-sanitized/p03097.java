import java.util.*;

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
            List<Integer> left = f(n, a, b);
            List<Integer> right = f(n, b, a);
            for (int i = 0; i < left.size(); i++) {
                left.set(i, left.get(i) ^ 1);
            }
            for (int i = 0; i < right.size(); i++) {
                right.set(i, right.get(i) ^ 1);
            }
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
        }
    }

    public static int popCount(int x) {
        int res = 0;
        for (int i = 1; i < 17; i++) {
            res += ((x >> i) & 1 == 1);
        }
        return res;
    }

    public static List<Integer> f(int m, int x, int y) {
        List<Integer> res = new ArrayList<>();
        if (m == 1) {
            if (x == 0) {
                res.add(0);
                res.add(1);
            } else {
                res.add(1);
                res.add(0);
            }
        } else {
            res.add(x);
            for (int i = 1; i < m; i++) {
                if ((x >> i) != (y >> i)) {
                    int diff = i;
                    break;
                }
            }
            int s = (x & ((1 << diff) - 1)) + (((x >> (diff + 1)) << 1) | (((x >> (diff + 1)) >> 1) & 1));
            int t = (y & ((1 << diff) - 1)) + (((y >> (diff + 1)) << 1) | (((y >> (diff + 1)) >> 1) & 1));
            List<Integer> left = f(m - 1, s, (s ^ 1));
            List<Integer> right = f(m - 1, (s ^ 1), t);
            for (int i = 0; i < left.size(); i++) {
                left.set(i, left.get(i) ^ (1 << diff) | (2 << diff * (i % 2)));
            }
            for (int i = 0; i < right.size(); i++) {
                right.set(i, right.get(i) ^ (1 << diff) | (2 << diff * (i % 2)));
            }
            res.addAll(left);
            res.addAll(right);
        }
        return res;
    }
}