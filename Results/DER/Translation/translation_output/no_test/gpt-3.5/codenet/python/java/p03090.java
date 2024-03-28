```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EdgePairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Pair> edge = new ArrayList<>();

        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new Pair(s, t));
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new Pair(s, t));
                }
            }
        }

        System.out.println(edge.size());
        for (Pair pair : edge) {
            System.out.println(pair.s + " " + pair.t);
        }
    }

    static class Pair {
        int s;
        int t;

        Pair(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }
}
```
