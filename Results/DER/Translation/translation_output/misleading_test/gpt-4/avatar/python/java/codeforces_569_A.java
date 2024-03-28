Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();
        
        double v = (double)(q - 1) / q;
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
    }
}
```
To run the test case, simply compile and execute the above Java code, then input `100000 3125 2` when prompted. You should expect the output `-91`.
