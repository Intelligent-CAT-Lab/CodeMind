import java.util.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int gcd = gcd(A, B);
        List<Integer> primeFactors = primeFactorize(gcd);
        HashSet<Integer> uniquePrimeFactors = new HashSet<>(primeFactors);
        primeFactors = new ArrayList<>(uniquePrimeFactors);

        int ans = primeFactors.size();
        for (int i = 0; i < Math.pow(2, primeFactors.size()); i++) {
            int composite = 1;
            int count = 0;
            for (int j = 0; j < primeFactors.size(); j++) {
                if (((i >> j) & 1) == 1) {
                    composite *= primeFactors.get(j);
                    count += 1;
                }
            }
            for (int j = 0; j < primeFactors.size(); j++) {
                if (primeFactors.get(j).equals(composite) && count >= 2) {
                    ans -= 1;
                    break;
                }
            }
        }
        System.out.println(ans + 1);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }
}