import java.util.*;

public class p02946 {
    final static int INTMAX = 9223372036854775807;
    final static int INTMIN = -9223372036854775808;
    final static long DVSR = 1000000007;

    public static long POW(long x, long y) {
        return Math.pow(x, y, DVSR);
    }

    public static long INV(long x, long m) {
        return POW(x, m - 2, m);
    }

    public static long DIV(long x, long y, long m) {
        return (x * INV(y, m)) % m;
    }

    public static List<Integer> LI() {
        Scanner sc = new Scanner(System.in);
        return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    public static List<Double> LF() {
        Scanner sc = new Scanner(System.in);
        return Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).collect(Collectors.toList());
    }

    public static String LS() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int II() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static List<Long> FLIST(int n) {
        List<Long> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= n; i++) {
            res.add(res.get(i - 1) * i % DVSR);
        }
        return res;
    }

    public static long gcd(long x, long y) {
        if (x < y) {
            x, y = y, x;
        }
        long div = x % y;
        while (div != 0) {
            x, y = y, div;
            div = x % y;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = II();
        int X = II();

        for (int i = Math.max(X - K + 1, -1000000); i <= Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}