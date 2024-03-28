Below is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int oCount = (int) s.chars().filter(ch -> ch == 'o').count();
        int result = 700 + 100 * oCount;
        
        System.out.println(result);
        scanner.close();
    }
}
```

This Java code does the following:

- Imports the `Scanner` class for getting user input.
- Defines a `Main` class and its `main` method as the program entry point.
- Creates a `Scanner` instance to read from the standard input.
- Reads a `String` from the input.
- Counts the occurrences of the letter 'o' in the input string.
- Calculates the result by adding 700 to 100 times the count of 'o' characters.
- Prints the result to the standard output.
- Closes the `Scanner` to avoid resource leaks.
