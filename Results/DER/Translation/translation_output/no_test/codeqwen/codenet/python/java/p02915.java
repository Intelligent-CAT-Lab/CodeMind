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

This Java code does the same thing as the Python code: it reads integers from the standard input, cubes each integer, and prints the result. The `Scanner` class is used to read from the standard input, and the `split` method is used to split each line of input into words. The `Integer.parseInt` method is used to convert the first word of each line into an integer. The `System.out.println` method is used to print the result of cubing each integer.
