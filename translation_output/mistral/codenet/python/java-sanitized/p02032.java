import java.util.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> primeFactors = new HashMap<>();
        List<Integer> primeList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            primeList.add(i);
        }
        primeList.set(1, 0);
        int numSqrt = (int) Math.sqrt(n);

        for (int prime : primeList) {
            if (prime == 0) {
                continue;
            }
            if (prime > numSqrt) {
                break;
            }

            for (int nonPrime = 2 * prime; nonPrime <= n; nonPrime += prime) {
                primeList.set(nonPrime, 0);
            }
        }

        List<Integer> primeFactorsList = new ArrayList<>(primeList.subList(1, primeList.size()));
        primeFactors.put(primeFactorsList.get(0), 1);
        int count = 1;
        for (int i = 1; i < primeFactorsList.size(); i++) {
            int prime = primeFactorsList.get(i);
            while (n % prime == 0) {
                primeFactors.put(prime, count);
                n /= prime;
                count++;
            }
        }
        if (n != 1) {
            primeFactors.put(n, count);
        }

        int result = primeFactors.size();
        long product = 1;
        for (int value : primeFactors.values()) {
            product *= (value + 1);
        }
        System.out.println(result + " " + (product - 1));
    }
}