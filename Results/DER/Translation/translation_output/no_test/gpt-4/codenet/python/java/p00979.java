Here's the translated Python code into Java:

```java
import java.util.Scanner;

public class TimeTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int count = 0;
        int speed = 1;
        int margin = 0;
        while (t > 0) {
            t -= speed;
            count++;
            if (margin + speed * 3 <= t) {
                speed *= 3;
                margin += speed;
            } else if (t < margin) {
                margin -= speed;
                speed /= 3;
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
```

The Java code includes the necessary imports and wraps the functionality in a class and `main` method, which is the entry point for a Java application. The input is gathered using a `Scanner` object, and the rest of the logic follows closely with the Python code translated into the appropriate Java syntax and constructs.
