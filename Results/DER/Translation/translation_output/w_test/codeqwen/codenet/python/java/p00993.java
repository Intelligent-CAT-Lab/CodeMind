Here is the Java equivalent of the Python code you provided:

```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 1500).reduce(1, (a, b) -> a * b) + 2);
        IntStream.rangeClosed(1, Integer.parseInt(System.console().readLine())).forEach(i -> System.out.println(i + 1));
    }
}
```

This Java code does the same thing as the Python code. It first calculates the product of all numbers from 1 to 1500 (inclusive) and adds 2 to the result. Then it reads an integer from the console, adds 1 to each number from 1 to that integer (inclusive), and prints each number on a new line.
