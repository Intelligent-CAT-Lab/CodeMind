Here's the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println((a + b) % 24);
        
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: it reads two integers from the standard input, adds them together, and then calculates the result modulo 24 to simulate the behavior of an hours clock. It then prints the result to the standard output.
