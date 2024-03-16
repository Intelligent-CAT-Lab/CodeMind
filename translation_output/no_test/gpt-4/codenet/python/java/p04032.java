Here is the translated Python code to Java:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }

        for (int i = 0; i < S.length() - 2; i++) {
            Set<Character> uniqueChars = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                uniqueChars.add(S.charAt(j));
            }
            if (uniqueChars.size() <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }

        System.out.println("-1 -1");
    }
}
```

Please note the following changes that are made while converting from Python to Java:

- Importing `Scanner` class for input and `HashSet` and `Set` to maintain unique characters.
- Adding the `main` method, which is the entry point for Java programs.
- Declaring the input `String S` and reading it through `Scanner`.
- Checking the length of the `String S` to decide on the logic, analogous to the Python `len(S)`.
- Using a `for` loop to traverse the string and a `HashSet` to maintain the unique characters within a given range.
- Java array subscript starts from `0`, so the positions output is adjusted by adding 1.
- Using `System.out.println` for output.
- Closing the `Scanner` to avoid resource leak.
- Using `System.exit(0)` and `return` to terminate the program when needed. Since we're inside the `main` method, a simple `return` suffices to terminate the program (the `System.exit(0)` is not mandatory).
