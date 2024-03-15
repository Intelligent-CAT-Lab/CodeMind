Here's the equivalent Java code based on your Python code snippet. Please note that Java does not have an equivalent for Python's `exit()`, so we use `return` within the `main` method, which will exit the program when it is encountered.

```java
import java.util.Scanner;

public class SequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Logic equivalent to the given Python code
        if (n < a + (b - 1) || n > a + (b - 1) * a) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < a; i++) {
            System.out.print((n - a + i + 1) + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println();
            return;
        }
        int loop = n / (b - 1);
        int option = n % (b - 1);
        for (int j = 0; j < b - 1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop + 1; i++) {
                    System.out.print((n - loop - 1 + i + 1) + " ");
                }
                n -= loop + 1;
                option -= 1;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print((n - loop + i + 1) + " ");
                }
                n -= loop;
            }
        }
        System.out.println();
    }
}
```

This Java program will behave similarly to the Python code, reading three integers separated by spaces as input and producing the sequence accordingly. Make sure to run this Java code in an environment where you can provide input from the console.
