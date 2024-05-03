Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);

        boolean condition = !(Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d));
        System.out.println(condition ? "YNeos" : "es");
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, then checks if the absolute difference between `a` and `c` is less than or equal to `d`, or if the absolute difference between `a` and `b` is less than or equal to `d` and the absolute difference between `b` and `c` is less than or equal to `d`. If the condition is true, it prints "YNeos", otherwise it prints "es".
