Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "a";
        System.out.println(nextCharacter(input));
    }

    public static String nextCharacter(String input) {
        List<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        int idx = al.indexOf(input.charAt(0));
        return String.valueOf(al.get(idx + 1));
    }
}
```

This Java code does the same thing as your Python code. It creates a list of all lowercase letters, finds the index of the input character in the list, and then returns the character at the next index. The `nextCharacter` method is encapsulated inside the `Main` class. The `main` method is the entry point of the program, where it calls the `nextCharacter` method with the input "a" and prints the result.
