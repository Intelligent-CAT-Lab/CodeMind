import java.util.*;

public class p02032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        HashMap<Integer, Integer> primeFactorization = new HashMap<>();
        
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primeFactorization.put(i, primeFactorization.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n > 1) {
            primeFactorization.put(n, primeFactorization.getOrDefault(n, 0) + 1);
        }
        
        int numFactors = primeFactorization.size();
        int totalFactors = 1;
        for (int count : primeFactorization.values()) {
            totalFactors *= (count + 1);
        }
        System.out.println(numFactors + " " + (totalFactors - 1));
    }
}