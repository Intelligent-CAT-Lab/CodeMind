Here's the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
        
        scanner.close();
    }
}
```

Given the inputs 2 10 20, this Java program will produce the same outputs as the provided Python code.
