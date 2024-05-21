import java.util.ArrayList;
import java.util.List;

public class p02467 {
    public static void main(String[] args) {
        System.out.println(primeFactorization(12));
    }

    public static String primeFactorization(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }

        List<Integer> res = new ArrayList<>();
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            res.add(n);
        }

        return res.toString();
    }
}