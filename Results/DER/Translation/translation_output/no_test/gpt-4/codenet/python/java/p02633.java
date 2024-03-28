Below is the Java implementation of your provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i < Math.pow(10, 5); i++) {
            if ((360 * i) % x == 0) {
                System.out.println((360 * i) / x);
                break;
            }
        }

        scanner.close();
    }
}
```

The java code above imports the Scanner class for console input, defines a main method, reads an integer input `x`, runs a loop similar to the one in the provided Python code, and prints the result to the console. It then closes the scanner to avoid resource leaks.
