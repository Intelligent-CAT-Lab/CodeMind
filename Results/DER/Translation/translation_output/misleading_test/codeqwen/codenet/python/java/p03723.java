Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cnt = 0;
        int fa = a;
        int fb = b;
        int fc = c;
        while (true) {
            if (cnt != 0 && fa == a && fb == b && fc == c) {
                System.out.println(-1);
                return;
            }
            double tmp1 = a / 2.0;
            double tmp2 = b / 2.0;
            double tmp3 = c / 2.0;
            if (!isDouble(tmp1, tmp2, tmp3)) {
                break;
            }
            cnt += 1;
            a = (int) (tmp2 + tmp3);
            b = (int) (tmp1 + tmp3);
            c = (int) (tmp1 + tmp2);
            if (!rem(a, b, c)) {
                break;
            }
        }
        System.out.println(cnt);
    }

    public static boolean rem(int a, int b, int c) {
        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDouble(double a, double b, double c) {
        if (a % 1 != 0 || b % 1 != 0 || c % 1 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then enters a loop that performs the same operations as your Python code. The loop continues until the conditions for breaking the loop are met. The `rem`
