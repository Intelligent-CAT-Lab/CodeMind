import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (popCount(a^b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> result = f(n, a, b);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

    private static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += ((x >> i) & 1) == 1 ? 1 : 0;
        }
        return res;
    }

    private static List<Integer> f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new ArrayList<Integer>() {{add(0); add(1);}};
            } else {
                return new ArrayList<Integer>() {{add(1); add(0);}};
            }
        }

        List<Integer> res = new ArrayList<>();
        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) {
                diff = i;
                break;
            }
        }

        int s = (x % (1 << diff)) + (((x >> (diff + 1)) << diff));
        int t = (y % (1 << diff)) + (((y >> (diff + 1)) << diff));
        int u = s ^ 1;

        List<Integer> left = f(m - 1, s, u);
        List<Integer> right = f(m - 1, u, t);

        int x_bit = (x >> diff) & 1;
        int y_bit = (y >> diff) & 1;

        for (int i = 0; i < left.size(); i++) {
            left.set(i, left.get(i) % (1 << diff) + ((1 << diff) * x_bit) + ((left.get(i) >> diff) << (diff + 1)));
        }

        for (int i = 0; i < right.size(); i++) {
            right.set(i, right.get(i) % (1 << diff) + ((1 << diff) * y_bit) + ((right.get(i) >> diff) << (diff + 1)));
        }

        res.addAll(left);
        res.addAll(right);
        return res;
    }
}