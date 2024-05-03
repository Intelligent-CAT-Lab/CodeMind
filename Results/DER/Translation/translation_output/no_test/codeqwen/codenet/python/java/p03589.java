Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int h = 1; h <= 3500; h++) {
            for (int n = h; n <= 3500; n++) {
                if (4 * n * h - N * h - N * n > 0) {
                    if ((N * h * n) % (4 * n * h - N * h - N * n) == 0) {
                        int w = (N * h * n) / (4 * n * h - N * h - N * n);
                        System.out.println(h + " " + n + " " + w);
                        return;
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer N from the user, then it iterates over all possible values of h and n from 1 to 3500. If the condition 4 * n * h - N * h - N * n > 0 is true, it checks if the remainder of N * h * n divided by 4 * n * h - N * h - N * n is 0. If it is, it calculates the value of w and prints it. The program then exits. If no such values of h, n, and w are found, the program will not print anything.
