import java.util.*;
import java.math.*;

public class p02032 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        Map<BigInteger, BigInteger> primeFactors = primeFactorization(BigInteger.valueOf(n));
        BigInteger total = BigInteger.ONE;
        for (BigInteger power : primeFactors.values()) {
            total = total.multiply(power.add(BigInteger.ONE));
        }
        System.out.println(primeFactors.size() + " " + (total.subtract(BigInteger.ONE)));
    }

    static List<BigInteger> primes = new ArrayList<>();

    static Map<BigInteger, BigInteger> primeFactorization(BigInteger n) {
        Map<BigInteger, BigInteger> factors = new HashMap<>();
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return factors;
        }
        BigInteger num = n;
        for (BigInteger p : primes) {
            if (p.compareTo(n.sqrt()) > 0) {
                break;
            }
            while (num.mod(p).compareTo(BigInteger.ZERO) == 0) {
                factors.put(p, factors.getOrDefault(p, BigInteger.ZERO).add(BigInteger.ONE));
                num = num.divide(p);
            }
        }
        if (num.compareTo(BigInteger.ONE) > 0) {
            factors.put(num, BigInteger.ONE);
        }
        return factors;
    }

    static void makePrimeList(int num) {
        if (num < 2) {
            return;
        }
        List<BigInteger> primeList = new ArrayList<>(Collections.nCopies(num + 1, BigInteger.ONE));
        for (int i = 2; i <= num; i++) {
            if (primeList.get(i).compareTo(BigInteger.ONE) == 0) {
                primeList.set(i, BigInteger.valueOf(i));
                for (int j = 2 * i; j <= num; j += i) {
                    primeList.set(j, BigInteger.ZERO);
                }
            }
        }
        primes.addAll(primeList.stream().filter(p -> p.compareTo(BigInteger.ONE) > 0).toList());
    }

    static {
        makePrimeList((int) Math.sqrt(Integer.MAX_VALUE));
    }
}