Here is the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int X = scanner.nextInt();
        
        System.out.println((500 * K) >= X ? "Yes" : "No");
        
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code provided: it takes two integers as input, then prints "Yes" if 500 times the first integer is greater than or equal to the second integer, otherwise it prints "No".
