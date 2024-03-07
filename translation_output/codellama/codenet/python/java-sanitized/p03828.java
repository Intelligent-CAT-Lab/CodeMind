import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p03828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int ans = 1;

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
            if (i > 1) {
                num.add(i);
                count.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            ans = (ans * (entry.getValue() + 1)) % 1000000007;
        }

        System.out.println(ans);
    }
}