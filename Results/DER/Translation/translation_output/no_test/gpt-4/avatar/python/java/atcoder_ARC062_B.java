Here's the equivalent Java code for your provided Python script:

```java
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return reader.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int[] pin() {
        return Arrays.stream(readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static List<Integer> lispin() {
        return Arrays.stream(readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static void resolve() {
        String S = readLine();
        Map<Character, Long> countMap = S.chars().boxed()
                .collect(Collectors.groupingBy(k -> (char) k.intValue(), Collectors.counting()));
        
        long gCount = countMap.getOrDefault('g', 0L);
        long pCount = countMap.getOrDefault('p', 0L);
        System.out.println((gCount - pCount) / 2);
    }

    public static void main(String[] args) {
        // Increase the stack size programmatically if needed, not directly supported in Java as in Python.
        new Thread(null, Main::resolve, "resolve", 1<<26).start();
    }
}
```

A few important notes and adjustments made to this translation:

1. Java doesn't have a direct function to change the recursion limit (`sys.setrecursionlimit`) as Python does. If you need to increase the stack size for recursive calls in Java, you can use the `-Xss` option for the JVM or programmatically create a thread with increased stack size as shown in the main function.
  
2. The `input`, `pin`, `tupin`, and `lispin` functions are consolidated into two methods `readLine` and `pin` – Java does not have the same kind of function aliasing as can be done in Python with the `lambda` syntax.

3. This Java code uses streams to process and collect input into integer arrays and lists, and also to count occurrences of characters.

4. Java does not have a direct counterpart to Python's `Counter` class, but its frequencies can be determined using streams as shown above.

5. A `Map` is used to store character frequencies.

6. Division by a literal integer `2` is performed to match the integer division in Python. If `gCount` and `pCount` were floating-point numbers, you would need to cast one operand as `(int)` to get integer division.
