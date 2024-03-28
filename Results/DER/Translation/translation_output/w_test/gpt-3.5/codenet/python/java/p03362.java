```java
import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> primes = makePrimeNumbers(2000);

        List<Integer> ans = new ArrayList<>();
        for (int prime : primes) {
            if (prime % 10 == 1) {
                ans.add(prime);
            }
            if (ans.size() == n) {
                break;
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static List<Integer> makePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int prime : primeNumbers) {
                if (prime >= Math.sqrt(i) + 1) {
                    primeNumbers.add(i);
                    break;
                }
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && !primeNumbers.contains(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
```
