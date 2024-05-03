Here is the Java version of your Python code:

```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 1500).reduce(1, (x, y) -> x * y) + 2);
        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}
```

This Java code does the same thing as your Python code. It first calculates the product of all numbers from 1 to 1500 (inclusive) and adds 2 to the result. Then it reads an integer from the user and prints all integers from 1 to that number (inclusive).
