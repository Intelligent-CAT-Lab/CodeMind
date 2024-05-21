import java.util.*;
import java.math.*;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        Map<Character, Integer> d = new HashMap<>();
        for (char c : S.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        int dd = 0;
        for (int i : d.values()) {
            if (i % 2 != 0) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i : d.values()) {
                dnm = dnm.multiply(BigInteger.valueOf(f(i / 2)));
            }
            System.out.println(f(lS / 2).divide(dnm));
        }
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        return n * f(n - 1);
    }
}