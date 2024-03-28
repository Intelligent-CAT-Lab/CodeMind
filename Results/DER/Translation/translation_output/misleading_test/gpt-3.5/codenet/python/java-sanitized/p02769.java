import java.util.*;

public class p02769 {
    static int i1() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static List<Integer> i2() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (String s : sc.nextLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    public static void main(String[] args) {
        long mod = 1000000007;
        int n = i2().get(0);
        int k = i2().get(1);

        if (n <= k) {
            long x = 1;
            for (int i = 0; i < n - 1; i++) {
                x *= 2 * n - 1 - i;
                x %= mod;
            }
            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                y *= i + 1;
                y %= mod;
            }
            System.out.println((x * bp(y, 1000000005)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for (int i = 0; i < k; i++) {
                t *= i + 1;
                t %= mod;
                y *= n - 1 - i;
                y %= mod;
                y *= n - i;
                y %= mod;
                long c = bp(t, 1000000005);
                x += y * c * c;
                x %= mod;
            }
            System.out.println(x);
        }
    }

    static long bp(long a, long n) {
        long r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = r * a % 1000000007;
            }
            a = a * a % 1000000007;
            n >>= 1;
        }
        return r;
    }
}