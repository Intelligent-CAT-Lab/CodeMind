Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        scanner.close();

        Map<Integer, Map<List<Integer>, Integer>> dp = new HashMap<>();
        for (int i = 0; i < 2 * N; i++) {
            dp.put(i, new HashMap<>());
        }

        dp.get(0).put(Arrays.asList(), 1);
        for (int i = 0; i < 2 * N - 1; i++) {
            Map<List<Integer>, Integer> current = dp.get(i);
            Map<List<Integer>, Integer> next = dp.get(i + 1);
            for (Map.Entry<List<Integer>, Integer> entry : current.entrySet()) {
                List<Integer> key = entry.getKey();
                int value = entry.getValue();
                if (key.isEmpty()) {
                    if (i + 1 <= K) {
                        next.put(Arrays.asList(i + 1), (next.getOrDefault(Arrays.asList(i + 1), 0) + value) % mod);
                    }
                } else {
                    int last = key.get(key.size() - 1);
                    if (i + 1 - last <= K) {
                        List<Integer> newKey = new ArrayList<>(key);
                        newKey.add(i + 1);
                        next.put(newKey, (next.getOrDefault(newKey, 0) + value) % mod);
                    }
                    if (key.size() > 1) {
                        int secondLast = key.get(key.size() - 2);
                        if (i + 1 - secondLast <= K) {
                            List<Integer>
