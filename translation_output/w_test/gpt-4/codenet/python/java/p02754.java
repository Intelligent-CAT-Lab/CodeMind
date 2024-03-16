Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int k = n / (a + b);
        int p = n % (a + b);
        
        System.out.println(k * a + Math.min(p, a));
        
        scanner.close();
    }
}
```

When you run this Java program, it will read three integers from the standard input (console), perform the calculations, and print out the result just like the provided Python code.
