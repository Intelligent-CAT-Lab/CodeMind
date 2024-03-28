Below is the translated Java code version of the provided Python code. The logic has been recreated using Java syntax and constructs, and it assumes that the input will be provided to the program via the command-line arguments.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        List<Edge> edges = new ArrayList<>();
        int length = (int)(Math.log(L) / Math.log(2)) + 1;
        for (int i = 1; i < length; i++) {
            edges.add(new Edge(i, i + 1, 1 << (i - 1)));
            edges.add(new Edge(i, i + 1, 0));
        }

        for (int i = 0; i < length - 1; i++) {
            if (((L >> i) & 1) == 1) {
                L -= (1 << i);
                edges.add(new Edge(i + 1, length, L));
            }
        }

        System.out.println(length + " " + edges.size());
        for (Edge edge : edges) {
            System.out.println(edge);
        }

        scanner.close();
    }

    static class Edge {
        int u, v, w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return u + " " + v + " " + w;
        }
    }
}
```

Please note that Java requires a defined class structure, so the logic is encapsulated in a `Main` class with a `main` method. I have also defined an `Edge` inner class to store the edge information, and overridden the `toString()` method to format it as required. The input logic uses `Scanner` to read from standard input, and the output is printed directly to the console.
