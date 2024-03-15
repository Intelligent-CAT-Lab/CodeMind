Here's the equivalent Java code for the Python code snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);
        int c = Integer.parseInt(inputs[3]);

        System.out.println(n - (c + a - c + b - c));

        scanner.close();
    }
}
```

This Java code does the same as the original Python code; it reads four integers from standard input and then prints the result of the given arithmetic operation. Note that in Java, we explicitly need to import the `Scanner` class for reading from standard input, split the input into an array, parse the integers, and then perform the arithmetic operation, as Java is statically-typed and requires that all variable types be declared.
