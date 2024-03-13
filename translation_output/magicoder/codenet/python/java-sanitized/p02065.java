import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        Map<Pair<Integer, List<Integer>>, Integer> dp = new HashMap<>();
        dp.put(new Pair<>(null, Arrays.asList(0)), 1);

        for (int i = 0; i < 2 * N - 1; i++) {
            Map<Pair<Integer, List<Integer>>, Integer> newDp = new HashMap<>();
            for (Map.Entry<Pair<Integer, List<Integer>>, Integer> entry : dp.entrySet()) {
                Pair<Integer, List<Integer>> key = entry.getKey();
                Integer value = entry.getValue();
                if (key.getValue().size() > K + 1) {
                    continue;
                }
                if (key.getKey() == null) {
                    if (!key.getValue().isEmpty() && i + 1 - key.getValue().get(0) <= K) {
                        newDp.put(new Pair<>(i + 1, Arrays.asList(i + 1)), (newDp.getOrDefault(new Pair<>(i + 1, Arrays.asList(i + 1)), 0) + value) % mod);
                    }
                } else if (i + 1 - key.getKey() <= K && key.getValue().size() > 1 && i + 1 - key.getValue().get(1) <= K) {
                    newDp.put(new Pair<>(key.getKey(), key.getValue().subList(1, key.getValue().size())), (newDp.getOrDefault(new Pair<>(key.getKey(), key.getValue().subList(1, key.getValue().size())), 0) + value) % mod);
                }
                if (!key.getValue().isEmpty() && i + 1 - key.getValue().get(key.getValue().size() - 1) <= K) {
                    List<Integer> newTop = new ArrayList<>(key.getValue());
                    newTop.add(i + 1);
                    newDp.put(new Pair<>(key.getKey(), newTop), (newDp.getOrDefault(new Pair<>(key.getKey(), newTop), 0) + value) % mod);
                }
            }
            dp = newDp;
        }

        int res = 0;
        for (Map.Entry<Pair<Integer, List<Integer>>, Integer> entry : dp.entrySet()) {
            if (entry.getKey().getValue().size() == 1) {
                assert entry.getKey().getKey() == 2 * N - 1;
                res = (res + entry.getValue()) % mod;
            }
        }
        System.out.println(res);
    }
}

class Pair<K, V> {
    private K key;
    private V value;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) &&
                Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}