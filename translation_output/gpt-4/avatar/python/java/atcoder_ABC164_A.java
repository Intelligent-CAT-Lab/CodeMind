Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
        scanner.close();
    }
}
```

Just as a side note: The Java version is more verbose since, in Java, you have to define the class and the `main` method explicitly, and also set up the `Scanner` for input handling. The conditional statement in Python's one-liner (ternary-like) is converted to a standard `if-else` block in Java.
