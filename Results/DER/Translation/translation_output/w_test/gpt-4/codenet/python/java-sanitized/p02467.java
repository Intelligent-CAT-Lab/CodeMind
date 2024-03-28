import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02467 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        List<Integer> factors = primeFactorization(n);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        scanner.close();
    }

    public static List<Integer> primeFactorization(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 2) {
            res.add(n);
            return res;
        }

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

        return res;
    }
}