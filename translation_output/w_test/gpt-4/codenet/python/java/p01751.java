Below is the Java implementation of the provided Python code:

```java
import java.util.Scanner;

public class SignalLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int t = 0;
        boolean found = false;
        
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                found = true;
                break;
            }
            t += a + b;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
```

This Java code reads three integers `a`, `b`, and `c` just like the python code did. It then iterates up to 61 times to simulate the signal light toggling between green and red, checking whether `c` falls within the green light duration `a`. If `c` is within the green light duration, it prints the time; otherwise, it continues to the next cycle. If a time is not found when `c` is within the green light duration after 61 iterations, the program prints `-1`.

You can compile and run this Java program. It will expect three integers as input (separated by spaces) and will output a single integer or `-1` as specified in the original Python code.
