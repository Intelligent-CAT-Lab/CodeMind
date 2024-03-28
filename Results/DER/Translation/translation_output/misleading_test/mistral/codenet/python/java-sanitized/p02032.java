import java.util.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
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
            primeFactors.put(n, 1);
        }
        int count = 0;
        int result = 1;
        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            count++;
            result *= (entry.getKey() + 1);
        }
        System.out.println(count + 1 + " " + (result - 1));
    }
}