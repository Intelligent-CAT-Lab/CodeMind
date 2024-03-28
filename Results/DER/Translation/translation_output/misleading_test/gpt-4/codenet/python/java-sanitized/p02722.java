import java.util.HashSet;
import java.util.Scanner;

public class p02722 {
    private static HashSet<Long> setl = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        setl.add(k);
        setl.add(k - 1);
        for (long x = 2; x <= Math.sqrt(k); x++) {
            check(x, k);
            check(k / x, k);
        }
        if (setl.contains(1L)) {
            setl.remove(1L);
        }
        System.out.println(setl.size());
        scanner.close();
    }

    public static void check(long i, long k) {
        long tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}