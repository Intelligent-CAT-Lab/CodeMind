import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02900 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int gcd = gcd(A, B);
        Set<Integer> primeFactor = new HashSet<>(primeFactorize(gcd));

        int ans = primeFactor.size();
        for(int i = 0; i < (1 << primeFactor.size()); i++){
            int iTemp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            Object[] primes = primeFactor.toArray();
            while(iTemp != 0){
                if(iTemp % 2 == 0){
                    // Do nothing, just pass
                } else {
                    composite *= (int)primes[j];
                    count++;
                }
                j++;
                iTemp >>= 1; // Equivalent to i_temp /= 2
            }

            for(int prime : primeFactor){
                if(prime == composite && count >= 2){
                    ans--;
                }
            }
        }

        System.out.println(ans + 1);
    }

    private static Set<Integer> primeFactorize(int n) {
        Set<Integer> factors = new HashSet<>();
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

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}