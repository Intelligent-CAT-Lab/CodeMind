Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int t = 0;
        if (a1 == 1 && a2 == 1) {
            System.out.println(0);
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2 += 1;
                    a1 -= 2;
                } else {
                    a2 -= 2;
                    a1 += 1;
                }
                t += 1;
            }
            System.out.println(t);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then enters a while loop that continues until either `a1` or `a2` is less than or equal to 0. In each iteration of the loop, it checks which of the two numbers is larger, and then increments the smaller number by 1 and decrements the larger number by 2. It also increments a counter `t` each time through the loop. After the loop finishes, it prints the value of `t`.
