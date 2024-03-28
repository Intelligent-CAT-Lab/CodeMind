import java.util.*;

public class p03362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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

    private static List<Integer> makePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNumbers) {
                if (p >= Math.sqrt(i) + 1) {
                    primeNumbers.add(i);
                    isPrime = false;
                    break;
                }
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}