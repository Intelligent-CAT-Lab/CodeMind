Here's the equivalent Java code for the given Python program. The Java code reads an integer from the command line arguments or standard input, calculates the connectivity based on whether the number is even or odd, and then outputs the connections:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConnectGraph {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
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
        for (int[] pair : edge) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
```

A sample test case would involve running the program, inputting `3` when prompted, and expecting the output `2` followed by the lines `1 3` and `2 3`.

To compile and run this Java program, perform the following steps in a terminal assuming you have Java installed:

1. Save the code to a file named `ConnectGraph.java`.
2. Compile the program with `javac ConnectGraph.java`.
3. Run the compiled program with `java ConnectGraph`.
4. Input `3` when prompted.
