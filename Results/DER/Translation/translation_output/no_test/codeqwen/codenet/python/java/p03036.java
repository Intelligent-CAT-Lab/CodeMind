Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int r = Integer.parseInt(inputs[0]);
        int d = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then it uses a for loop to calculate and print the values of `x` for 10 iterations.
