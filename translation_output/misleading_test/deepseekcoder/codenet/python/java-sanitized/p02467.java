import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        for (int prime : primeFactorization(n)) {
            System.out.print(prime + " ");
        }
    }

    private static List<Integer> primeFactorization(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 2) {
            res.add(n);
            return res;
        }

        for (int p = 2; p * p <= n; p++) {
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