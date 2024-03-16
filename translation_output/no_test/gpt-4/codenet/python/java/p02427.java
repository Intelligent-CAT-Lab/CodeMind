Here is the equivalent Java code for the provided Python script that enumerates subsets of a set with elements `0` to `n-1`.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bitset2EnumerationSubsets1 {

    // Generate all subsets for a set of size n
    public static Iterable<List<Integer>> subset(int n) {
        return () -> new java.util.Iterator<>() {
            private final int max = 1 << n; // 2 to the power of n
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < max;
            }

            @Override
            public List<Integer> next() {
                ArrayList<Integer> currentSubset = new ArrayList<>();
                for (int v = 0; v < n; v++) {
                    if ((current & (1 << v)) > 0) {
                        currentSubset.add(v);
                    }
                }
                current++;
                return currentSubset;
            }
        };
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int i = 0;
        for (List<Integer> vs : subset(n)) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).append(":");
            for (Integer v : vs) {
                sb.append(" ").append(v);
            }
            System.out.println(sb);
            i++;
        }
    }

    public static void main(String[] args) {
        run();
    }
}
```

This Java program defines an iterator inside `subset()` that generates all subsets when iterated, similar to a generator in Python. The `run()` function manages user interaction through the console, and `main()` is the entry point of the program.

To use this Java program, compile it first, and then run the compiled class file:
```
javac Bitset2EnumerationSubsets1.java
java Bitset2EnumerationSubsets1
```
Make sure to provide an integer input when the program prompts for it.
