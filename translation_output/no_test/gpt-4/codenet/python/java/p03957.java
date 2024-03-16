Here's the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = "";
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println(p == 2 ? "Yes" : "No");
    }
}
```

Please note:

- We use `Scanner` for getting the user input in Java.
- In Java, you need to use `charAt(i)` to get the character at a specific index of the string.
- Java uses `System.out.println` for printing text to the console.
- We don't need to declare `ss` as it’s not used in the provided Python code, but to keep it exactly equivalent to the given Python code, I have included it.
- The `main` method is the entry point for Java programs, so the code is wrapped inside a `Main` class with this method.
