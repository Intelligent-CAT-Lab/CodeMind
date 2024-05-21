import java.util.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int gcd = gcd(A, B);
        List<Integer> primeFactors = primeFactorize(gcd);
        Set<Integer> uniquePrimeFactors = new HashSet<>(primeFactors);
        int ans = uniquePrimeFactors.size();
        for (int i = 0; i < (1 << uniquePrimeFactors.size()); i++) {
            int composite = 1;
            int count = 0;
            int j = 0;
            int i_temp = i;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    i_temp /= 2;
                } else {
                    composite *= primeFactors.get(j);
                    count++;
                    i_temp /= 2;
                }
                j++;
            }
            if (count >= 2) {
                ans--;
            }
        }
        System.out.println(ans + 1);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }

    public static int gcd(int a, int b) {
        if (b == 0)