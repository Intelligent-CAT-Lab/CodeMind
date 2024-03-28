import java.util.*;

public class p02977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> e = get(n);
        if (e != null) {
            System.out.println("Yes");
            for (List<Integer> list : e) {
                System.out.println(list.get(0) + " " + list.get(1));
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
            // make line graph
            int m = n;
            while (m % 4 != 3) {
                m -= 1;
            }
            for (int i = 1; i < m; i++) {
                e.add(Arrays.asList(i, i + 1));
                e.add(Arrays.asList(n + i, n + i + 1));
            }
            e.add(Arrays.asList(m, n + 1));
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m -= 1;
                }
                e.add(Arrays.asList(m - 1, m));
                e.add(Arrays.asList(m, n + 1));
                e.add(Arrays.asList(n + 1, n + m - 1));
                e.add(Arrays.asList(n + m - 1, n + m));
            }
            if (n % 4 == 0 || n % 4 == 2) { // not a power of 2
                int t = n - 1;
                e.add(Arrays.asList(n, t));
                for (int i = 1; i < n + 1; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(Arrays.asList(n + i, n + n));
                        break;
                    }
                }
            }
        }
        return e;
    }
}