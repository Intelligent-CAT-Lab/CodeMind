import java.util.*;

public class p02977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> e = get(n);
        if (e.size() > 0) {
            System.out.println("Yes");
            for (List<Integer> edge : e) {
                System.out.println(edge.get(0) + " " + edge.get(1));
            }
        } else {
            System.out.println("No");
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
                List<Integer> edge = new ArrayList<>();
                edge.add(i);
                edge.add(i + 1);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(n + i);
                edge.add(n + i + 1);
                e.add(edge);
            }
            List<Integer> edge = new ArrayList<>();
            edge.add(m);
            edge.add(n + 1);
            e.add(edge);
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                edge = new ArrayList<>();
                edge.add(m - 1);
                edge.add(m);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(m);
                edge.add(n + 1);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(n + 1);
                edge.add(n + m - 1);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(n + m - 1);
                edge.add(n + m);
                e.add(edge);
            }
            if (n % 4 == 0 || n % 4 == 2) {
                int t = n - 1;
                edge = new ArrayList<>();
                edge.add(n);
                edge.add(t);
                e.add(edge);
                for (int i = 1; i < n + 1; i++) {
                    t ^= i;
                    if (t == n) {
                        edge = new ArrayList<>();
                        edge.add(n + i);
                        edge.add(n + n);
                        e.add(edge);
                        break;
                    }
                }
            }
        }
        return e;
    }
}