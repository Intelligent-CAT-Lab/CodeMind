import java.util.*;

public class p02467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(n + ": ");
        List<Integer> factors = primeFactorization(n);
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i) + " ");
        }
    }

    public static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n < 2) {
            factors.add(n);
            return factors;
        }

        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
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