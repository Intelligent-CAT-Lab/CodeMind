```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        
        Map<Pair, Integer>[] dp = new HashMap[2*N];
        for (int i = 0; i < 2*N; i++) {
            dp[i] = new HashMap<>();
        }

        dp[0].put(new Pair(null, new Pair(0)), 1);

        for (int i = 0; i < 2*N-1; i++) {
            for (Map.Entry<Pair, Integer> entry : dp[i].entrySet()) {
                Pair key = entry.getKey();
                int v = entry.getValue();

                Pair left = key.getLeft();
                Pair top = key.getRight();

                if (top.size() > K+1) {
                    continue;
                }

                if (left == null) {
                    if (!top.isEmpty() && i+1 - top.getFirst() <= K) {
                        dp[i+1].put(new Pair(i+1, top), (dp[i+1].getOrDefault(new Pair(i+1, top), 0) + v) % mod);
                    }
                } else if (i+1 - left <= K && top.size() > 1 && i+1 - top.getSecond() <= K) {
                    dp[i+1].put(new Pair(i+1, top.removeFirst()), (dp[i+1].getOrDefault(new Pair(i+1, top), 0) + v) % mod);
                }

                if (!top.isEmpty() && i+1 - top.getLast() <= K) {
                    top.addLast(i+1);
                    dp[i+1].put(new Pair(left, top), (dp[i+1].getOrDefault(new Pair(left, top), 0) + v) % mod);
                }
            }
        }

        int res = 0;
        for (Map.Entry<Pair, Integer> entry : dp[2*N-1].entrySet()) {
            Pair key = entry.getKey();
            int v = entry.getValue();

            Pair left = key.getLeft();
            Pair top = key.getRight();

            if (top.size() == 1) {
                assert left.getSecond() == 2*N - 1;
                res = (res + v) % mod;
            }
        }

        System.out.println(res);
    }

    static class Pair {
        Integer left;
        Pair right;

        public Pair(Integer left, Pair right) {
            this.left = left;
            this.right = right;
        }

        public Integer getLeft() {
            return left;
        }

        public Pair getRight() {
            return right;
        }

        public Pair removeFirst() {
            return new Pair(left, right.right);
        }

        public Pair removeLast() {
            return new Pair(left, right.left);
        }

        public Integer getFirst() {
            return right.left;
        }

        public Integer getSecond() {
            return right.right;
        }

        public void addLast(Integer elem) {
            right = new Pair(right.left, elem);
        }

        public void addFirst(Integer elem) {
            right = new Pair(elem, right.right);
        }

        public int size() {
            return right == null ? 0 : 1 + right.size();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair pair = (Pair) obj;
            return left.equals(pair.left) && right.equals(pair.right);
        }

        @Override
        public int hashCode() {
            return 31 * left.hashCode() + right.hashCode();
        }
    }
}
```

