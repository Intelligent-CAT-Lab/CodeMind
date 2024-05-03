Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(n-(c+a-c+b-c));
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, and then prints the result of the expression `n-(c+a-c+b-c)`. The `Scanner` class is used to read input from the user.
