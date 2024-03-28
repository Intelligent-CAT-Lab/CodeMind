import java.util.*;
import java.lang.*;
import java.io.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> primeFactors = primeFactorization(n);
        int len = primeFactors.size();
        int val = 1;
        for (int v : primeFactors.values()) {
            val *= (v + 1);
        }
        System.out.println(len + " " + (val - 1));
    }

    private static HashMap<Integer, Integer> primeFactorization(int n) {
        HashMap<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                if (primeFactors.containsKey(i)) {
                    primeFactors.put(i, primeFactors.get(i) + 1);
                } else {
                    primeFactors.put(i, 1);
                }
                n /= i;
            }
        }
        if (n != 1) {
            if (primeFactors.containsKey(n)) {
                primeFactors.put(n, primeFactors.get(n) + 1);
            } else {
                primeFactors.put(n, 1);
            }
        }
        return primeFactors;
    }
}