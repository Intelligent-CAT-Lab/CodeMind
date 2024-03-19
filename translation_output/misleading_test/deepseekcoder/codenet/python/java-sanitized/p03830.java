import java.util.*;

public class p03830 {
    static int mod = (int)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Map.Entry<Integer, Integer> entry : factorization(i).entrySet()) {
                d.put(entry.getKey(), d.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r = (r * (c + 1)) % mod;
        }
        System.out.println(r);
    }

    public static HashMap<Integer, Integer> factorization(int n) {
        HashMap<Integer, Integer> buff = new HashMap<>();
        int c = 0, m = n;
        while (m % 2 == 0) {
            c += 1;
            m /= 2;
        }
        if (c > 0) buff.put(2, c);
        c = 0;
        while (m % 3 == 0) {
            c += 1;
            m /= 3;
        }
        if (c > 0) buff.put(3, c);
        int x = 5;
        while (m >= x * x) {
            c = 0;
            while (m % x == 0) {
                c += 1;
                m /= x;
            }
            if (c > 0) buff.put(x, c);
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (m > 1) buff.put(m, 1);
        return buff;
    }
}