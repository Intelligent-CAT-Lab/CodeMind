Below is the translated Java code from the given Python code. Note that Java does not include high-level functions to abstract away the standard input handling and counting functionality, so we manually implement them. For quick standard input reading, we'll use `Scanner` and for counting we'll use `HashMap` from Java's Collections framework.

```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        scanner.useDelimiter("\\s"); // To handle inputs separated by any whitespace
        resolve();
    }
    
    private static void resolve() {
        String S = scanner.nextLine().replace(" ", ""); // Remove all whitespaces
        HashMap<Character, Integer> characterCounts = countCharacters(S);
        int result = (characterCounts.getOrDefault('g', 0) - characterCounts.getOrDefault('p', 0)) / 2;
        System.out.println(result); 
    }

    private static HashMap<Character, Integer> countCharacters(String input) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char ch : input.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        return counts;
    }
}
```

Remember to input the test case "2 2" (without quotes) as one single line. This is because we're reading the entire line as the string input through `scanner.nextLine()`.

Explanation of changes:
- Defined a new class `Main` and the `main` method as the entry point of the program.
- Created a `Scanner` instance for reading input from the standard input.
- Implemented a `resolve` function that mimics the functionality of the Python code.
- Wrote a `countCharacters` function to count character occurrences, replacing Python's `Counter` from the `collections` module.
- Instead of lambdas and higher-order functions for input handling, we directly used `Scanner` methods.
- Java does not support default function arguments as in Python. Thus, `pin`, `tupin`, and `lispin` are not ported since those are high-level abstractions around input parsing and not necessary in this context.
