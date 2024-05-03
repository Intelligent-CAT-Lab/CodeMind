Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println((4 * a * b < (c - a - b) * (c - a - b)) ? "Yes" : "No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the value of `c - a - b`, and then checks if `4 * a * b < (c - a - b) * (c - a - b)`. If the condition is true, it prints "Yes", otherwise it prints "No".
