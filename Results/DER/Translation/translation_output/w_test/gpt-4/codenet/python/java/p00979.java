Here's the translated Java code encapsulating the logic from the provided Python code:

```java
import java.util.Scanner;

public class SpeedCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the test input

        int count = 0;
        int speed = 1;
        int margin = 0;
        while (t > 0) {
            t -= speed;
            count += 1;
            if (margin + speed * 3 <= t) {
                speed *= 3;
                margin += speed;
            } else if (t < margin) {
                margin -= speed;
                speed /= 3;
            }
        }
        System.out.println(count); // The expected output
    }
}
```

To run a test case using the given Java code, compile and execute the `SpeedCounter` class using a Java compiler and supply the input `19`. The expected output will be `5`.
