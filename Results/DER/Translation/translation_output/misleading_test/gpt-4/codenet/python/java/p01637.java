Here is the translated Java code based on the provided Python script:

```java
import java.util.Scanner;

public class Main {
    private static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int rd = scanner.nextInt();
        int rr = scanner.nextInt();
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();
        scanner.close();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) ex += 1;

        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) ey += 1;

        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
    }
}
```

To use this Java program, you'd input the space-separated values just as in the Python version. If you place the input `7 3 5 4 2` and run this Java program, it would display `9277` as expected. 

Note: Ensure that your input format in Java matches the format expected by the `Scanner` class methods called in the `main` method. You can also remove the `scanner.close();` line if you plan to use the scanner for more input operations later in your code.
