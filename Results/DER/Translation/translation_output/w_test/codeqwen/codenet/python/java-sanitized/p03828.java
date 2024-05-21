import java.util.*;

public class p03828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 1;
        List<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            } else {
                num.add(i);
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (int) ((ans * (n + 1)) % 1000000007);
        }
        System.out.println(ans);
    }
}