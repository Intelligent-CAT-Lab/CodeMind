import java.util.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A, B);
        List<Integer> primeFactors = primeFactorize(gcd);
        Set<Integer> set = new HashSet<>(primeFactors);
        List<Integer> primeFactorsList = new ArrayList<>(set);
        int ans = primeFactorsList.size();
        for (int i = 0; i < Math.pow(2, primeFactorsList.size()); i++) {
            int composite = 1;
            int count = 0;
            for (int j = 0; j < primeFactorsList.size(); j++) {
                if ((i & (1 << j)) > 0) {
                    composite *= primeFactorsList.get(j);
                    count++;
                }
            }
            if (primeFactorsList.contains(composite) && count >= 2) {
                ans--;
            }
        }
        System.out.println(ans + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            while (n % f == 0) {
                factors.add(f);
                n /= f;
            }
        }
        if (n!= 1) {
            factors.add(n);
        }
        return factors;
    }
}