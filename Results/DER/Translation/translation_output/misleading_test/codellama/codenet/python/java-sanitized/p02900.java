import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class p02900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int gcd = gcd(A, B);
        List<Integer> primeFactors = primeFactorize(gcd);
        Set<Integer> uniquePrimeFactors = new HashSet<>(primeFactors);
        int ans = uniquePrimeFactors.size();
        for (int i = 0; i < (int) Math.pow(2, primeFactors.size()); i++) {
            int iTemp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (iTemp != 0) {
                if (iTemp % 2 == 0) {
                    // do nothing
                } else if (iTemp % 2 == 1) {
                    composite *= primeFactors.get(j);
                    count++;
                }
                j++;
                iTemp /= 2;
            }
            for (int j : primeFactors) {
                if (j == composite && count >= 2) {
                    ans--;
                }
            }
        }
        System.out.println(ans + 1);
    }

    private static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        } else {
            return gcd(B, A % B);
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