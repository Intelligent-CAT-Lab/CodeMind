import java.util.HashMap;

public class p02065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();

        HashMap<Pair, Integer>[] dp = new HashMap[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            dp[i] = new HashMap<>();
        }

        dp[0].put(new Pair(null, new Pair(0)), 1);

        for (int i = 0; i < 2 * N - 1; i++) {
            for (HashMap.Entry<Pair, Integer> entry : dp[i].entrySet()) {
                Pair key = entry.getKey();
                int v = entry.getValue();
                Pair left = key.getKey();
                Pair top = key.getValue();

                if (top.size() > K + 1) {
                    continue;
                }

                if (left == null) {
                    if (!top.isEmpty() && i + 1 - top.getFirst() <= K) {
                        dp[i + 1].put(new Pair(i + 1, top), (dp[i + 1].getOrDefault(new Pair(i + 1, top), 0) + v) % mod);
                    }
                } else if (i + 1 - left.getFirst() <= K && top.size() > 1 && i + 1 - top.getLast() <= K) {
                    dp[i + 1].put(new Pair(i + 1, top.getSubList(1, top.size())), (dp[i + 1].getOrDefault(new Pair(i + 1, top.getSubList(1, top.size())), 0) + v) % mod);
                }

                if (!top.isEmpty() && i + 1 - top.getLast() <= K) {
                    top.add(i + 1);
                    dp[i + 1].put(new Pair(left, top), (dp[i + 1].getOrDefault(new Pair(left, top), 0) + v) % mod);
                }
            }
        }

        int res = 0;
        for (HashMap.Entry<Pair, Integer> entry : dp[2 * N - 1].entrySet()) {
            Pair key = entry.getKey();
            int v = entry.getValue();
            Pair left = key.getKey();
            Pair top = key.getValue();

            if (top.size() == 1) {
                assert left.getFirst() == 2 * N - 1;
                res = (res + v) % mod;
            }
        }

        System.out.println(res);
    }

    static class Pair {
        private Integer first;
        private LinkedList<Integer> second;

        public Pair(Integer first, LinkedList<Integer> second) {
            this.first = first;
            this.second = second;
        }

        public Integer getFirst() {
            return first;
        }

        public LinkedList<Integer> getSecond() {
            return second;
        }

        public Integer getLast() {
            return second.getLast();
        }

        public LinkedList<Integer> getSubList(int fromIndex, int toIndex) {
            return new LinkedList<>(second.subList(fromIndex, toIndex));
        }

        public void add(Integer value) {
            second.add(value);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }
}