The Python code you provided defines a function `f(a, b, c)` which returns the result of the comparison `a * b < 100 * c`. It then reads five space-separated integers from standard input, calculates `ex` and `ey` using integer division, and increments them if they satisfy the condition provided by the function `f`. Finally, it prints `m - ex - ey` if that value is non-negative, or `-1` otherwise.

The equivalent Java code would be:

```java
import java.util.Scanner;

public class Main {
    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int rd = scanner.nextInt();
        int rr = scanner.nextInt();
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) ex++;
        
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) ey++;
        
        int result = m - ex - ey;
        System.out.println(result >= 0 ? result : -1);
        
        scanner.close();
    }
}
```

This Java code can be compiled and executed. Remember to provide the input in the same way you would for Python, which is as space-separated integers on a single line.
