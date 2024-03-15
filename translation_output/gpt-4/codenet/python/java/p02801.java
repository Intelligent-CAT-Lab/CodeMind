Here's the translated code from Python to Java:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class NextLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String input = scanner.next(); // Reading a single character from user
        char C = input.charAt(0);

        ArrayList<Character> al = new ArrayList<>();
        for (char idx = 'a'; idx <= 'z'; idx++) {
            al.add(idx);
        }

        int index = al.indexOf(C);
        System.out.println(al.get(index + 1));
    }
}
```

A few things to note about this translation:
- Java uses `Scanner` for input instead of the `input()` function in Python.
- In Java, `char` types are used for characters, and there's no equivalent to Python's `chr()` because characters in Java can be directly added to the array list as chars.
- In Java, array lists are generic and must have a specific type; in this case, the type is `Character`.
- Java uses `System.out.println` for output instead of Python's `print` function.
- The `main` method is the entry point for a Java program.
