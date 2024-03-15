Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class DownloadTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        double s = scanner.nextDouble();
        double q = scanner.nextDouble();

        double v = (q - 1) / q;
        int tm = 1;
        double t = s / (1 - v);

        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = s / (1 - v);
        }

        System.out.println(tm);
        scanner.close();
    }
}
```

Note that the `scanner.nextDouble()` method is used instead of `scanner.nextInt()` when reading `s` and `q` because in the Python code they could potentially be floating-point numbers due to the division operation. We want to ensure the same behavior in the Java code.
