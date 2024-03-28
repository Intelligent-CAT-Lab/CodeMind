```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rd = sc.nextInt();
        int rr = sc.nextInt();
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        int ex = cd * 100 / rd;
        if (f(ex, rd, cd))
            ex += 1;
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr))
            ey += 1;
        System.out.println((m - ex - ey) >= 0 ? (m - ex - ey) : -1);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```
