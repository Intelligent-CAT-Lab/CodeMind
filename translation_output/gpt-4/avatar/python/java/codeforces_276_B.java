Below is the Java equivalent of the given Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();

        for (char i : s) {
            dt.put(i, dt.getOrDefault(i, 0) + 1);
        }

        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (cnt < 1) {
                    cnt++;
                } else {
                    x = false;
                    break;
                }
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x) {
            System.out.println("First");
        }

        scanner.close();
    }
}
```

In this translation, we replace Python's `list()` with Java's `toCharArray()` to convert the input string to a character array. We also use the `HashMap` class in Java to replicate the behavior of the dictionary in Python. The `getOrDefault()` method is used to replace the Pythonic `if i in dt` check to either get the value associated with a key or a default value if that key is not already in the map. The rest of the code logic follows closely with the Python source with appropriate Java syntax modifications.
