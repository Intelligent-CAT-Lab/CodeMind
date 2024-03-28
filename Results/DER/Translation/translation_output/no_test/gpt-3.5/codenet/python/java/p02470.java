```java
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFunctions {

    public static ArrayList<Integer> primes(int n) {
        int rn = (int) Math.sqrt(n);
        int[] sieve = new int[rn + 1];
        for (int i = 2; i <= rn; i++) {
            int j = i * 2;
            while (j <= rn) {
                sieve[j] = 1;
                j += i;
            }
        }
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 2; i <= rn; i++) {
            if (sieve[i] == 0) {
                p.add(i);
            }
        }
        return p;
    }

    public static int phiFunc(int n, ArrayList<Integer> p) {
        int ans = n;
        for (int q : p) {
            if (n % q == 0) {
                ans = ans * (q - 1) / q;
                while (n % q == 0) {
                    n /= q;
                }
            }
        }
        if (n > 1) {
            ans = ans * (n - 1) / n;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> primesList = primes(n);
        System.out.println(phiFunc(n, primesList));
        scanner.close();
    }
}

```

