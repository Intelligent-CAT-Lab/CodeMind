Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it finds the largest integer `w` such that `w * (w + 1) / 2 < N <= (w + 1) * (w + 2) / 2`. Then it prints all integers from `w` down to 1, subtracting each integer from `N` until `N` becomes 0.
