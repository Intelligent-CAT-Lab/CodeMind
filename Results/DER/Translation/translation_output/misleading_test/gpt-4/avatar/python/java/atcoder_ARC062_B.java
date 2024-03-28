Here is the python code translated to Java. I've assumed that standard input will be passed in the same way as in the provided test case, i.e., as command line arguments.

```java
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // The following function is equivalent to Python's input().rstrip().
        String getLine = br.readLine().trim();

        // Equivalent to Counter in Python, we use a HashMap in Java
        Map<Character, Integer> counter = new HashMap<>();
        for (char ch : getLine.toCharArray()) {
            // Ignore spaces which are explicit in Python's `c[" g "]`
            if (ch != ' ') {
                counter.put(ch, counter.getOrDefault(ch, 0) + 1);
            }
        }

        // The equivalent of print((c["g"] - c["p"]) // 2)
        int result = (counter.getOrDefault('g', 0) - counter.getOrDefault('p', 0)) / 2;
        System.out.println(result);

        br.close();
    }
}
```

Please note that since the problem is regarding reading from the Standard Input, the Java solution is also structured to read from standard input. You can provide inputs to this Java program by using input redirection (e.g., `java Main < input.txt`) or by typing manually into the console.

Remember that unlike in the Python code, in Java, you will need to compile the code before running it. You can compile the code with `javac Main.java` and run it with `java Main` command.
