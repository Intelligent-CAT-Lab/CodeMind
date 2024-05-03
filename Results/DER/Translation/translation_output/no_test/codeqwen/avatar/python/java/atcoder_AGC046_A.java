Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i += 1;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, adds it to a running total, and checks if the total is a multiple of 360. If it is, it prints the number of iterations it took to reach that total and breaks out of the loop. If it isn't, it increments the counter and continues the loop.
