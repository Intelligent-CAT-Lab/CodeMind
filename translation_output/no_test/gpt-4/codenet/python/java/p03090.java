Here is the equivalent Java code of the given Python script:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphEdges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<int[]> edge = new ArrayList<>();
        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new int[]{s, t});
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new int[]{s, t});
                }
            }
        }

        System.out.println(edge.size());
        for (int[] st : edge) {
            System.out.println(st[0] + " " + st[1]);
        }

        scanner.close();
    }
}
```
This code uses `Scanner` for input, an `ArrayList` to store the edges (since arrays are fixed-size in Java, and we don't know the size beforehand), and `System.out.println` for output. Each edge is an array of two integers, represented as `new int[]{s, t}`.
