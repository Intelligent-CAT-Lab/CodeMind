import java.util.ArrayList;
import java.util.Scanner;

public class p02467 {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        ArrayList<Integer> factors = primeFactorization(n);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        scanner.close();
    }

    public static ArrayList<Integer> primeFactorization(int n) {
        if (n < 2) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(n);
            return res;
        }

        ArrayList<Integer> res = new ArrayList<>();
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