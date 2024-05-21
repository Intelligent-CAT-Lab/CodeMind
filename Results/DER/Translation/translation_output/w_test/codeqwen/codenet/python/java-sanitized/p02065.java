import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        scanner.close();

        List<Map<List<Integer>, Integer>> dp = new ArrayList<>();
        for (int i = 0; i < 2 * N; i++) {
            dp.add(new HashMap<>());
        }

        dp.get(0).put(Arrays.asList(), 1);
        for (int i = 0; i < 2 * N - 1; i++) {
            for (Map.Entry<List<Integer>, Integer> entry : dp.get(i).entrySet()) {
                List<Integer> left = entry.getKey();
                int v = entry.getValue();
                if (left == null) {
                    if (!left.isEmpty() && i + 1 - left.get(0) <= K) {
                        dp.get(i + 1).put(Arrays.asList(i + 1), (dp.get(i + 1).getOrDefault(Arrays.asList(i + 1), 0) + v) % mod);
                    }
                } else if (!left.isEmpty() && i + 1 - left.get(0) <= K && !left.isEmpty() && i + 1 - left.get(left.size() - 1) <= K) {
                    List<Integer> newLeft = new ArrayList<>(left);
                    newLeft.add(i + 1);
                    dp.get(i + 1).put(newLeft, (dp.get(i + 1).getOrDefault(newLeft, 0) + v) % mod);
                }
                if (!left.isEmpty() && i + 1 - left.get(left.size() - 1) <= K) {
                    List<Integer> newLeft = new ArrayList<