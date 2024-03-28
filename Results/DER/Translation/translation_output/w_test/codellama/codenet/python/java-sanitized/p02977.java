import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p02977 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> e = get(n);
        if (e.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (List<Integer> edge : e) {
                System.out.println(edge.get(0) + " " + edge.get(1));
            }
        }
    }

    public static List<List<Integer>> get(int n) {
        List<List<Integer>> e = new ArrayList<>();
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
                e.add(List.of(i, i + 1));
                e.add(List.of(n + i, n + i + 1));
            }
            e.add(List.of(m, n + 1));
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                e.add(List.of(m - 1, m));
                e.add(List.of(m, n + 1));
                e.add(List.of(n + 1, n + m - 1));
                e.add(List.of(n + m - 1, n + m));
            }
            if (n % 4 == 0 || n % 4 == 2) {
                int t = n - 1;
                e.add(List.of(n, t));
                for (int i = 1; i < n + 1; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(List.of(n + i, n + n));
                        break;
                    }
                }
            }
        }
        return e;
    }
}