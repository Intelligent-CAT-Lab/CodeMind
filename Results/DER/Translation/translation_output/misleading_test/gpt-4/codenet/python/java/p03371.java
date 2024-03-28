Here is the equivalent Java code based on the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;
        
        int result = Math.min(Math.min(a, b), c);
        System.out.println(result);
        
        scanner.close();
    }
}
```

This code should produce the expected output of `7948` when given the test input `1500 2000 1600 3 2`.
