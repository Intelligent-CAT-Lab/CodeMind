Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine().split(" ")[0]);
            System.out.println(n * n * n);
        }
    }
}
```

This Java code does the same thing as the Python code: it reads an integer from the standard input, cubes it, and prints the result. The `Scanner` class is used to read from the standard input, and the `split` method is used to split the input string into an array of strings, which is then converted to an integer using the `Integer.parseInt` method. The `System.out.println` method is used to print the result. The `while` loop is used to read multiple inputs from the standard input.
