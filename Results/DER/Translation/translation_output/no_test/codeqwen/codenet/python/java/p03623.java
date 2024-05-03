Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the absolute difference between `x` and `a` and `x` and `b`, and then prints "A" if the difference between `x` and `a` is less than the difference between `x` and `b`, and "B" otherwise.
