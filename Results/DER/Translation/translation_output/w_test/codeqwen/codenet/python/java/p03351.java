Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        System.out.println(new String[]{"No", "Yes"}[(Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) ? 1 : 0]);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, then checks if the absolute difference between `a` and `c` is less than or equal to `d`, or if the absolute difference between `a` and `b` is less than or equal to `d` and the absolute difference between `b` and `c` is less than or equal to `d`. If the condition is true, it prints "Yes", otherwise it prints "No".
