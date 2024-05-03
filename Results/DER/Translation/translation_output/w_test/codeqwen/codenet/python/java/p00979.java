Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

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

This Java code does the same thing as your Python code. It reads an integer from the user, then enters a loop that continues until the remaining time `t` is less than or equal to 0. In each iteration of the loop, it subtracts the current speed from `t`, increments the count, and then checks if the new remaining time is greater than or equal to the new margin plus three times the current speed. If it is, it increases the speed by a factor of three and updates the margin. If the new remaining time is less than the new margin, it decreases the margin and divides the speed by three. Finally, it prints the count after the loop finishes.
