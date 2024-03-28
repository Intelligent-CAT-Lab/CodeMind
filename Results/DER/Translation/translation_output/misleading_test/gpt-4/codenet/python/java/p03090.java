Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class GraphEdges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Pair> edge = new ArrayList<>();
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
        for (Pair p : edge) {
            System.out.println(p.s + " " + p.t);
        }

        scanner.close();
    }

    static class Pair {
        int s;
        int t;

        public Pair(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }
}
```

You can compile and run this Java program, and when you input `3`, it will output the expected result:

```
2
1 3
2 3
```

Note: In Java, it is conventional to encapsulate each class in its own file. However, for simplicity, the `Pair` class is nested within the `GraphEdges` class here. If you were to follow best practices more strictly, `Pair` should be placed in a separate file named `Pair.java`.
