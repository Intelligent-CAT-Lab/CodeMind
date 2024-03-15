import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("{}: ".format(n));
        List<Integer> primeFactors = primeFactorization(n);
        for (int factor : primeFactors) {
            System.out.print(factor + " ");
        }
    }

    public static List<Integer> primeFactorization(int n) {
        if (n < 2) {
            return new ArrayList<>(Arrays.asList(n));
        }

        List<Integer> factors = new ArrayList<>();
        int limit = (int) Math.sqrt(n);

        for (int p = 2; p <= limit; p++) {
            while (n % p == 0) {
                factors.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }
}