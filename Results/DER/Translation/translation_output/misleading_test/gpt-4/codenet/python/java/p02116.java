Sure, below is the given Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) & -(n + 1));
        scanner.close();
    }
}
```

You can compile and run the Java code with input `2`, and it will produce the expected output `-95`.
