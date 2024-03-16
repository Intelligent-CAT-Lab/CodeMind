Here's the equivalent Java code for the given Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
        
        scanner.close();
    }
}
```

This Java program does the same thing as your Python code: it reads two integers as input, compares them, and prints "unsafe" if the second integer is greater than or equal to the first one, or "safe" otherwise.
