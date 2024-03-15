```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        
        double v = (double) (q - 1) / q;
        int tm = 1;
        double t = (double) s / (1 - v);
        
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = (double) s / (1 - v);
        }
        
        System.out.println(tm);
    }
}
```
