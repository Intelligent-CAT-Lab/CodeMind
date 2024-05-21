import java.util.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        resolve(n);
    }

    public static void resolve(int n) {
        int numSqrt = (int) Math.sqrt(n);
        List<Integer> primeList = makePrimeList(numSqrt);
        Map<Integer, Integer> dictCounter = primeFactorization(n, primeList);
        int val = 1;
        for (int v : dictCounter.values()) {
            val *= (v + 1);
        }
        System.out.println(dictCounter.size() + " " + (val - 1));
    }

    public static List<Integer> makePrimeList(int num) {
        if (num < 2) {
            return new ArrayList<>();
        }

        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            primeList.add(i);
        }
        primeList.set(1, 0);

        for (int prime : primeList) {
            if (prime == 0) {
                continue;
            }
            if (prime > num) {
                break;
            }

            for (int nonPrime = 2 * prime; nonPrime <= num; nonPrime += prime) {
                primeList.set(nonPrime, 0);
            }
        }

        return primeList.stream().filter(i -> i != 0).collect(Collectors.toList());
    }

    public static Map<Integer, Integer> primeFactorization(int num, List<Integer> primeList) {
        if (num <= 1) {
            return new HashMap<>();
        } else {
            Map<Integer, Integer> dictCounter = new HashMap<>();
            for (int prime : primeList) {
                while (num % prime == 0) {
                    dictCounter.put(