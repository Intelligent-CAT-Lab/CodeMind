Below is the translated Java code from the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a + b == 15) {
            System.out.println('+');
        } else if (a * b == 15) {
            System.out.println('*');
        } else {
            System.out.println('x');
        }
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: it takes two space-separated integer inputs `a` and `b`, then checks if their sum equals 15 and prints a plus sign; if their product equals 15, it prints an asterisk; otherwise, it prints an 'x'.
