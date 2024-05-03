Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);

        int get = A - B;

        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the difference between the first and second integer, subtracts this difference from the third integer, and then checks if the result is less than zero. If it is, it sets the result to zero. Finally, it prints the result.
