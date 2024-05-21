import java.util.*;

public class p03830 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Map.Entry<Integer, Integer> entry : factorization(i).entrySet()) {
                d.put(entry.getKey(), d.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= 1000000007;
        }
        System.out.println(r);
    }

    public static Map<Integer, Integer> factorization(int n) {
        Map<Integer, Integer> result = new HashMap<>();
        int m = n;
        for (int x = 2; m >= x * x; x += 6) {
            int c = 0;
            while (m % x == 0) {
                c++;
                m /= x;
            }
            if (c > 0) {
                result.put(x, c);
            }
        }
        if (m > 1) {
            result.put(m, 1);
        }
        return result;
    }
}