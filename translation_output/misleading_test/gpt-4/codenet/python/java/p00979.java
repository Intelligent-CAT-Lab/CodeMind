Here is the translated Java code that executes the same logic as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.close();

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
        System.out.println(count);
    }
}
```

You can compile and run this Java program. When you input `19`, the program should print `-5` as the expected output (although it appears the Python code would actually print a positive integer as it stands, and it's unclear why a negative value is expected). If a negative value is actually required from the logic, this would need to be clarified as it doesn't arise naturally from the given algorithm.
