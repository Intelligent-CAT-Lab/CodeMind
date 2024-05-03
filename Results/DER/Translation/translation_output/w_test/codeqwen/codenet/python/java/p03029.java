Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println((3*a+p)/2);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the result of the expression `(3*a+p)//2`, and prints the result. The `Scanner` class is used to read the input from the user. The `nextInt()` method is used to read an integer from the user. The `System.out.println()` method is used to print the result. The `/` operator is used for integer division in Java, unlike Python's `//` operator which performs floor division.
