Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int result = n - (c + a - c + b - c);
        System.out.println(result);
        
        scanner.close();
    }
}
```

Make sure you provide the necessary input in the same format as the Python code expects or modify the input method accordingly for your specific use case.
