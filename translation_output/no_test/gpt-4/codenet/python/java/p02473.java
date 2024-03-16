Here is the equivalent Java code for the given Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
        scanner.close();
    }
}
```

This Java code reads a line of input, splits it into a string array using space as the delimiter (similar to Python's `split()` method), then parses the strings to integers and prints the result of the subtraction.
