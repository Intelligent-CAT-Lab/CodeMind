Here is the translated Java code. Please note that in Java, we need to use `Scanner` for input, use an `ArrayList` to store pairs of integers, and comparators for sorting. The division in Java automatically does integer division when both operands are integers, similar to the `//` operator in Python.

```java
import java.util.*;

public class Main {
    private static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<Pair>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new Pair(l, r));
        }

        long ans = 0;
        for (List<Pair> LR : memo.values()) {
            LR.sort(Comparator.comparingInt(p -> p.left));

            double cur = -INF;
            for (Pair p : LR) {
                if (cur < p.left) {
                    ans += (p.right - p.left) / D + 1;
                    cur = p.right;
                } else if (cur < p.right) {
                    ans += (p.right - cur) / D;
                    cur = p.right;
                }
            }
        }

        System.out.println(ans);
    }

    static class Pair {
        int left, right;

        Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}
```
Make sure you import the necessary packages if your development environment does not do it automatically.

This code assumes the class is named `Main` and you have to put the inner `Pair` class inside the `Main` class. If you are using a different class name, make sure to adjust accordingly.

Also, note that in Java, the `Map.getOrDefault` method has been replaced with `Map.computeIfAbsent` to initialize the `ArrayList` if the key doesn't exist.
