Below is the translated Java code that performs the equivalent logic of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Perform the conditional checks and output the result
        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }

        scanner.close();
    }
}
```

To use this Java class, compile it and run it with a JVM. Input the test case when prompted for input. The program will output the result as expected.
