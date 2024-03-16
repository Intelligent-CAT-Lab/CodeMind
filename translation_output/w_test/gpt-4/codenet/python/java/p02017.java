Here's the equivalent code in Java, which takes the input from the standard input, processes it, and outputs the result to the standard output:

```java
import java.util.Scanner;

public class HWXY_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if (((long)H * W * (X + Y)) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Please remember to run the Java class in an environment that accepts standard input. This code does not include any input validation and assumes that the user input is in the correct format as provided in the test case.
