Below is the translated version of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {

    public static boolean rem(int a, int b, int c) {
        return !(a % 2 != 0 || b % 2 != 0 || c % 2 != 0);
    }

    public static boolean isDouble(double a, double b, double c) {
        return !(a % 1 != 0 || b % 1 != 0 || c % 1 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

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
            a = (int)(tmp2 + tmp3);
            b = (int)(tmp1 + tmp3);
            c = (int)(tmp1 + tmp2);

            if (!rem(a, b, c)) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
```

Note that the `isDouble()` method is checking if the variables are integers in the Python code, so in Java, this is trivial because typecasting from a double to an int would automatically floor the value. The Python `sys.exit()` is simply replaced with a `return` in the main method since it causes the program to exit anyway. Remember that Java has strong typing. Thus, information about variable types is preserved, and there's no need for the same checks as in Python for the isDouble method. Also, Java uses `System.out.println()` to print to the console, and `Scanner` is used for input operations.
