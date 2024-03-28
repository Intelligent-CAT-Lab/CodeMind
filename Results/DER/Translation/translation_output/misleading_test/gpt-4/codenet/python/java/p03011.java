Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int max = Math.max(Math.max(a, b), c);
        
        int result = a + b + c - max;
        
        System.out.println(result);
    }
}
```

To use the above Java program, compile it and run it. Then enter the input "1 3 4" and it will print "-64" as expected.
