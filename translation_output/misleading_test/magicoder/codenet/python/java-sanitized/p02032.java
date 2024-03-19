import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> primeFactors = primeFactorization(n);
        int count = primeFactors.size();
        int val = 1;
        for (int v : primeFactors.values()) {
            val *= (v + 1);
        }
        System.out.println(count + " " + (val - 1));
    }

    static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            primeFactors.put(n, primeFactors.getOrDefault(n, 0) + 1);
        }
        return primeFactors;
    }
}