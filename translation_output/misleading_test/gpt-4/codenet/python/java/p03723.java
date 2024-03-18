Below is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static boolean isEvenRemainder(int a, int b, int c) {
        return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
    }

    public static boolean isDouble(double a, double b, double c) {
        return a % 1.0 == 0 && b % 1.0 == 0 && c % 1.0 == 0;
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
            cnt++;
            a = (int)(tmp2 + tmp3);
            b = (int)(tmp1 + tmp3);
            c = (int)(tmp1 + tmp2);
            if (!isEvenRemainder(a, b, c)) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
```
This Java code follows the logic of the provided Python script, converting it to Java syntax. I've created methods `isEvenRemainder` and `isDouble`, corresponding to the Python functions `rem` and `isDouble`, respectively. The rest of the code logic remains mostly unchanged, adapted to Java's type system and syntax. The inputs are read using `Scanner`, and the division results are checked with `% 1.0` to determine if they are whole numbers.
