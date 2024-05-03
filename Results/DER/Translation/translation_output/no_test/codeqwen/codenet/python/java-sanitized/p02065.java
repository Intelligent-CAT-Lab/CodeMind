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
                List<Integer> top = entry.getKey();
                int v = entry.getValue();
                if (top.size() > K + 1) {
                    continue;
                }
                if (top.isEmpty()) {
                    if (!top.isEmpty() && i + 1 - top.get(0) <= K) {
                        dp.get(i + 1).put(Arrays.asList(i + 1), (dp.get(i + 1).getOrDefault(Arrays.asList(i + 1), 0) + v) % mod);
                    }
                } else if (i + 1 - top.get(0) <= K && top.size() > 1 && i + 1 - top.get(1) <= K) {
                    List<Integer> newTop = new ArrayList<>(top);
                    newTop.remove(0);
                    dp.get(i + 1).put(newTop, (dp.get(i + 1).getOrDefault(newTop, 0) + v) % mod);
                }
                if (!top.isEmpty() && i + 1 - top.get(top.size() - 1) <= K) {