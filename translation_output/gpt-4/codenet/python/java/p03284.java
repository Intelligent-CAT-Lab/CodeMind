Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: it reads two integers `n` and `k` from the standard input, checks if `n` is divisible by `k`, and prints `0` if it is and `1` otherwise. Make sure to import `java.util.Scanner` for reading input.
