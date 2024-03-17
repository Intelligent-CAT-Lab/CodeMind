import java.util.*;

public class p03830 {
    static int mod = (int)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
    }

    static int solve(int n) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Map.Entry<Integer, Integer> entry : factorization(i).entrySet()) {
                d.put(entry.getKey(), d.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r = (r * (c + 1)) % mod;
        }
        return (int)r;
    }

    static Map<Integer, Integer> factorization(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        if (c > 0) {
            map.put(2, c);
        }
        c = 0;
        while (n % 3 == 0) {
            c++;
            n /= 3;
        }
        if (c > 0) {
            map.put(3, c);
        }
        int x = 5;
        while (n >= x * x) {
            c = 0;
            while (n % x == 0) {
                c++;
                n /= x;
            }
            if (c > 0) {
                map.put(x, c);
            }
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (n > 1) {
            map.put(n, 1);
        }
        return map;
    }
}