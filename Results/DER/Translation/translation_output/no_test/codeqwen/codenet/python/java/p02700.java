Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int D = Integer.parseInt(inputs[3]);

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, then enters a loop that subtracts `B` from `C` and `D` from `A` until either `C` or `A` is less than or equal to 0. If `C` is less than or equal to 0, it prints "Yes" and breaks out of the loop. If `A` is less than or equal to 0, it prints "No" and breaks out of the loop.
