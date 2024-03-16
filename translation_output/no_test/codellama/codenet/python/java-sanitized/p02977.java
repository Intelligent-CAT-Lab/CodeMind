import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p02977 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < 2 * n + 1; i++) {
            g.add(new ArrayList<>());
        }
        List<Integer> e = get(n);
        if (e == null) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i) + " " + e.get(i + 1));
        }
    }

    public static List<Integer> get(int n) {
        List<Integer> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            int m = n;
            while (m % 4 != 3) {
                m--;
            }
            for (int i = 1; i < m; i++) {
                e.add(i);
                e.add(i + 1);
            }
            e.add(m);
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                e.add(m - 1);
                e.add(m);
                e.add(n + 1);
                e.add(n + m - 1);
            }
            if (n % 4 == 0 || n % 4 == 2) {
                int t = n - 1;
                e.add(n);
                for (int i = 1; i < n + 1; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(n + i);
                        break;
                    }
                }
            }
        }
        return e;
    }
}