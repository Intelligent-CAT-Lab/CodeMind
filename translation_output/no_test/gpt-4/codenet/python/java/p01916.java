Certainly! Here is the equivalent Java code of the given Python script:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> dic = new HashMap<>();
        String input = scanner.next();
        char[] S = input.toCharArray();

        for (char s : S) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }

        int ans = 0;
        for (int count : dic.values()) {
            if ((count & 1) == 1) {
                ans++;
            }
        }

        System.out.println(ans >> 1);
        scanner.close();
    }
}
```

Some highlights of the translation:

- In Java, we define a `HashMap` to store characters and their counts instead of the Python dictionary.
- The `Scanner` class is used to read the input from the user.
- `getOrDefault` is a Java method on maps similar to the Python dictionary's behavior for returning a default value when a key is not found.
- The bitwise AND and right shift operations are the same as in Python.
- Instead of using Python's `list` type, in Java, we work with character arrays and collections.
- Inputs and outputs are handled with `System.in` and `System.out`.
- Java requires an explicit class and `main` method as an entry point for the application.
