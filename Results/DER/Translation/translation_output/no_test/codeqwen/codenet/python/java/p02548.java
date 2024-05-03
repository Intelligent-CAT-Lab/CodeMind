Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it uses two nested loops to calculate the product of all possible pairs of numbers less than `n`. If the product is greater than or equal to `n`, the loop breaks and the next pair of numbers is checked. The count of such pairs is then printed out.
