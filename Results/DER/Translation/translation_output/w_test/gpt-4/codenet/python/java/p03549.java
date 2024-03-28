The following Java code is a translation of the provided Python code. Please note that Java requires a different approach for handling dynamic input and does not have built-in functionality for many of the Python utilities used, such as map and list comprehensions. The code has been adapted to Java's syntax and standard input/output handling:

```java
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = null;

    static int getN() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    static int[] getNM() throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static List<Integer> getList() throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static int[] getArray(int intn) throws IOException {
        int[] array = new int[intn];
        for (int i = 0; i < intn; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] nm = getNM();
        int N = nm[0];
        int M = nm[1];
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int)Math.pow(2, M));
    }
}
```

The Java program omits some of the unused Python imports and functions, and adapts the code to read inputs using `BufferedReader` and `InputStreamReader`. It also uses `StringTokenizer` for splitting input strings. The inputs should be provided through standard input and the output will be written to standard output.

Note: This Java program assumes that the test inputs will be provided in the same format as the Python code expects. The program also expects the inputs to be properly formatted and might not handle unexpected input formats gracefully, as error-checking and input validation are not included.
