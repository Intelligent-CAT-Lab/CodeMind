Here is the Java equivalent of your Python code including a main method to allow for command-line input:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println((n-1) * n / 2);
        
        scanner.close();
    }
}
```

This Java program reads an integer from the standard input, calculates the value of `(n-1) * n / 2` using integer arithmetic, and outputs the result to the standard output. It's important to note that integer division in Java automatically floors the result, just as the `//` operator does in Python.
