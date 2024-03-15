import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p02032 {
    // Set up a BufferedReader for efficient input reading
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        new Main().resolve();
    }

    public void resolve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> d = primeFactorization2(n);
        int val = 1;
        for (int v : d.values()) {
            val *= (v + 1);
        }
        System.out.println(d.size() + " " + (val - 1));
    }

    public HashMap<Integer, Integer> primeFactorization2(int num) {
        if (num <= 1) {
            return null;
        } else {
            int numSqrt = (int) Math.floor(Math.sqrt(num));
            int[] primeList = makePrimeList2(numSqrt);

            HashMap<Integer, Integer> dictCounter = new HashMap<>();
    
            for (int prime : primeList) {
                if (prime == 0) continue; // Skip non-prime markers
                while (num % prime == 0) {
                    dictCounter.put(prime, dictCounter.getOrDefault(prime, 0) + 1);
                    num /= prime;
                }
            }
            if (num != 1) {
                dictCounter.put(num, dictCounter.getOrDefault(num, 0) + 1);
            }

            return dictCounter;
        }
    }

    public int[] makePrimeList2(int num) {
        if (num < 2) {
            return new int[0];
        }

        int[] primeList = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            primeList[i] = i; // Initialize the prime list
        }

        double numSqrt = Math.sqrt(num);

        for (int prime = 2; prime <= numSqrt; prime++) {
            if (primeList[prime] == 0) {
                continue;
            }

            for (int nonPrime = 2 * prime; nonPrime <= num; nonPrime += prime) {
                primeList[nonPrime] = 0; // Mark non-prime numbers
            }
        }

        return primeList;
    }
}