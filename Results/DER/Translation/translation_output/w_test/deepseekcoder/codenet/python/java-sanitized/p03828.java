import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class p03828 {
    static final long MOD = (long)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();
        long ans = 1;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            }
            if (!num.contains(i)) {
                num.add(i);
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = ans * (n+1) % MOD;
        }
        System.out.println(ans);
    }
}