Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    int product = (i * j) % 2019;
                    if (product < min) {
                        min = product;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if the difference between the two integers is greater than 2019, and if it is, it prints 0. If the difference is not greater than 2019, it calculates the product of all possible pairs of integers between L and R (inclusive), finds the minimum product, and prints it.
