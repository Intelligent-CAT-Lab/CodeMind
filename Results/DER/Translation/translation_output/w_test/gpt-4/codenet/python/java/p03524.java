Below is the translated Python code into Java code:

```java
import java.util.HashMap;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> sFrqDict = new HashMap<>();
        sFrqDict.put('a', 0);
        sFrqDict.put('b', 0);
        sFrqDict.put('c', 0);

        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.get(s) + 1);
        }

        int maxFreq = Collections.max(sFrqDict.values());
        int minFreq = Collections.min(sFrqDict.values());

        if (maxFreq - minFreq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code assumes that the input string (S) will only contain 'a', 'b', or 'c' characters, as per the Python code provided. If you expect other characters, you'll need to modify the initialization of the `sFrqDict` HashMap appropriately.
