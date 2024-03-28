Certainly! Below is the equivalent Java code to the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = Math.min(A * N, B);
        
        System.out.println(result);
        
        scanner.close();
    }
}
```

This Java code does the same thing as the provided Python code: it reads three integers `N`, `A`, and `B` from the input, calculates the minimum between `A * N` and `B`, and outputs the result.
