import java.util.*;

public class p03830 {
    static int mod = (int)1e9 + 7;

    static List<int[]> factorization(int n) {
        List<int[]> buff = new ArrayList<>();
        int c = 0;
        while (n % 2 == 0) {
            c += 1;
            n /= 2;
        }
        if (c > 0) buff.add(new int[]{2, c});
        c = 0;
        while (n % 3 == 0) {
            c += 1;
            n /= 3;
        }
        if (c > 0) buff.add(new int[]{3, c});
        int x = 5;
        while (n >= x * x) {
            c = 0;
            while (n % x == 0) {
                c += 1;
                n /= x;
            }
            if (c > 0) buff.add(new int[]{x, c});
            if (x % 6 == 5) x += 2;
            else x += 4;
        }
        if (n > 1) buff.add(new int[]{n, 1});
        return buff;
    }

    static int main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int[] pair : factorization(i)) {
                d.put(pair[0], d.getOrDefault(pair[0], 0) + pair[1]);
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
}