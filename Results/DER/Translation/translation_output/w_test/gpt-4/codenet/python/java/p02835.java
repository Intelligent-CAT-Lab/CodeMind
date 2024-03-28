Here is the Java equivalent of the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        System.out.println(a + b + c < 22 ? "win" : "bust");

        scanner.close();
    }
}
```

This Java program does the same thing as the Python code: it reads three integers from the standard input, checks if their sum is less than 22, and prints "win" if this is true or "bust" otherwise. It uses the ternary conditional operator (`condition ? trueValue : falseValue`) to achieve the inline conditional logic you see in the Python code.
