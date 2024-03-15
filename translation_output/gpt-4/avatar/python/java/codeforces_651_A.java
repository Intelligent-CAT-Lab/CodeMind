Here's the equivalent Java code:

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
                    a1 -= 2;
                    a2 += 1;
                } else {
                    a1 += 1;
                    a2 -= 2;
                }
                t++;
            }
            System.out.println(t);
        }
        scanner.close();
    }
}
```

This Java code does the same thing as the provided Python code. It takes two integers from the user input, then performs operations on them inside a loop, keeping track of how many iterations occur with the variable `t`. If both input numbers start as 1, it immediately prints 0. Otherwise, it enters a loop where it alters the numbers according to the specified logic and increments the counter until one of the numbers is no longer positive, after which it prints out the counter.
