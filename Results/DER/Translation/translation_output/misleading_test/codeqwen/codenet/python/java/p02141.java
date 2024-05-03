Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double a = (Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2));
        double b = (Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2));
        System.out.println(b/a);
    }
}
```

This Java code does the same thing as your Python code. It reads in the input values, calculates the values of `a` and `b`, and then prints out the result. The `Math.min` and `Math.max` functions are used to calculate the minimum and maximum values, respectively. The `/` operator is used to calculate the division of `b` by `a`.
