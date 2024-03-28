Here is the equivalent Java code for the Python code you've provided:

```java
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> sFrqDict = new HashMap<Character, Integer>() {{
            put('a', 0);
            put('b', 0);
            put('c', 0);
        }};

        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.getOrDefault(s, 0) + 1);
        }

        int maxFrq = Collections.max(sFrqDict.values());
        int minFrq = Collections.min(sFrqDict.values());

        if (maxFrq - minFrq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Make sure you capture the input in a similar environment where the console is available for reading input from the user. The `Scanner` class is used for input operations in Java, and `System.out.println()` is used for output. We use a `HashMap` to store the character frequencies, and functions `Collections.max()` and `Collections.min()` to find the maximum and minimum values in the `HashMap`.
