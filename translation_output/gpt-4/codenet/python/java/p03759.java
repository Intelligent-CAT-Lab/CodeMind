Below is the Java equivalent of the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

This Java code performs the same logic as the Python code: it reads three integers from the input, checks if the difference between `a` and `b` is the same as the difference between `b` and `c`, and prints "YES" or "NO" accordingly.
