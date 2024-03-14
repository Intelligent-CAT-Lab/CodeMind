import java.util.*;

public class p03830 {
    static int inf = (int)1e20;
    static int mod = (int)1e9 + 7;
    static Scanner in = new Scanner(System.in);

    static List<Pair> factorization(int n) {
        List<Pair> buff = new ArrayList<>();
        int c = 0, m = n;
        while (m % 2 == 0) {
            c += 1;
            m /= 2;
        }
        if (c > 0) buff.add(new Pair(2, c));
        c = 0;
        while (m % 3 == 0) {
            c += 1;
            m /= 3;
        }
        if (c > 0) buff.add(new Pair(3, c));
        int x = 5;
        while (m >= x * x) {
            c = 0;
            while (m % x == 0) {
                c += 1;
                m /= x;
            }
            if (c > 0) buff.add(new Pair(x, c));
            if (x % 6 == 5)
                x += 2;
            else
                x += 4;
        }
        if (m > 1) buff.add(new Pair(m, 1));
        return buff;
    }

    static int main() {
        int n = in.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Pair p : factorization(i)) {
                d.put(p.key, d.getOrDefault(p.key, 0) + p.value);
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= mod;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }

    static class Pair {
        int key, value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}