```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Long, List<Pair<Long, Long>>> memo = new HashMap<>();
        long INF = Long.MAX_VALUE;

        int N = scanner.nextInt();
        long X = scanner.nextLong();
        long D = scanner.nextLong();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        for (int k = 0; k <= N; k++) {
            long l = k * X + (k - 1) * k / 2 * D;
            long r = k * X + (N - k + N - 1) * k / 2 * D;
            long modulo = l % D;
            List<Pair<Long, Long>> list = memo.getOrDefault(modulo, new ArrayList<>());
            list.add(new Pair<>(l, r));
            memo.put(modulo, list);
        }

        long ans = 0;
        for (List<Pair<Long, Long>> LR : memo.values()) {
            LR.sort((a, b) -> a.getKey().compareTo(b.getKey()));

            long cur = -INF;
            for (Pair<Long, Long> pair : LR) {
                long l = pair.getKey();
                long r = pair.getValue();
                if (cur < l) {
                    ans += (r - l) / D + 1;
                    cur = r;
                }
                if (cur < r) {
                    ans += (r - cur) / D;
                    cur = r;
                }
            }
        }

        System.out.println(ans);
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
```
