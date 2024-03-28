import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p02032 {

    static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine().trim());
        
        int num_sqrt = (int) Math.floor(Math.sqrt(n));
        int[] prime_list = makePrimeList(num_sqrt);
        
        Map<Integer, Integer> dict_counter = new HashMap<>();
        for (int prime : prime_list) {
            while (n % prime == 0) {
                dict_counter.put(prime, dict_counter.getOrDefault(prime, 0) + 1);
                n /= prime;
            }
        }
        if (n != 1) {
            dict_counter.put(n, dict_counter.getOrDefault(n, 0) + 1);
        }
        
        int val = 1;
        for (int v : dict_counter.values()) {
            val *= (v + 1);
        }
        
        System.out.println(dict_counter.size() + " " + (val - 1));
    }

    static int[] makePrimeList(int num) {
        if (num < 2) {
            return new int[0];
        }

        int[] primeList = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            primeList[i] = i;
        }
        primeList[1] = 0;
        
        for (int prime : primeList) {
            if (prime == 0) {
                continue;
            }
            if (prime > Math.sqrt(num)) {
                break;
            }
            for (int nonPrime = 2 * prime; nonPrime < num; nonPrime += prime) {
                primeList[nonPrime] = 0;
            }
        }
        
        int count = 0;
        for (int prime : primeList) {
            if (prime != 0) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int idx = 0;
        for (int prime : primeList) {
            if (prime != 0) {
                result[idx] = prime;
                idx++;
            }
        }
        return result;
    }
}