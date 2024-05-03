Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(int A, int B) {
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
                } else if (i_temp % 2 == 1) {
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
        return ans + 1;
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
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
            
