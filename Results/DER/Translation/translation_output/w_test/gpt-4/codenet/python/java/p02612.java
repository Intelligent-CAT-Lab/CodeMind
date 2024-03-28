To translate the given Python code to Java, we would read an integer from the standard input, perform the same modulo computation and conditional operation, and then print the result. Below is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 1000 != 0 ? 1000 - n % 1000 : 0);
        scanner.close();
    }
}
```

This Java code expects the user to input an integer and then outputs the expected result as demonstrated by the provided test case. If you have specific requirements for handling the input and output (e.g., command-line arguments, file I/O), let me know, and I can adjust the code accordingly.
