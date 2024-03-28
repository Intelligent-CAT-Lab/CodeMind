Here's the Python code translated into Java, which reads two integers from a single line of input and prints their sum:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A + B);
        scanner.close();
    }
}
```

This code assumes that the input will be provided in the same format as your test case (two integers separated by a space on a single line). The `Scanner` class is used to read the input, and it closes after reading the two integers to free resources.
