import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class p03828 {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();
        long ans = 1;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            int temp = i;
            boolean isPrime = true;

            for (int n : num) {
                while (temp % n == 0) {
                    count.put(n, count.get(n) + 1);
                    temp /= n;
                }
                if (temp == 1) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                num.add(temp);
                count.put(temp, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }

        System.out.println(ans);
        scanner.close();
    }
}