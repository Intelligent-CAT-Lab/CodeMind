Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int rd = Integer.parseInt(input[1]);
        int rr = Integer.parseInt(input[2]);
        int cd = Integer.parseInt(input[3]);
        int cr = Integer.parseInt(input[4]);

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex += 1;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
        }
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into individual words, and converts them to integers. It then calculates `ex` and `ey` based on the input, and prints the result of subtracting `ex` and `ey` from `m` if `m - ex - ey` is greater than or equal to 0, or -1 otherwise. The `f` method is the same as your Python function.
