import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class p03828 {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        scanner.close();
    
        Map<Long, Integer> count = new HashMap<>();
        long ans = 1;
        ArrayList<Long> num = new ArrayList<>();

        for (long i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (long n : num) {
                long tempI = i;
                while (tempI % n == 0) {
                    count.put(n, count.get(n) + 1);
                    tempI /= n;
                }
                if (tempI == 1) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                num.add(i);
                count.put(i, 1);
            }
        }
        
        for (int n : count.values()) {
            ans = ans * (n + 1) % MOD;
        }
        System.out.println(ans);
    }
}