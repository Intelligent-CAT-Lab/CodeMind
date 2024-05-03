Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                num[i / 10][i % 10] += 1;
            }
        }

        int c = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer N from the user, then creates a 2D array num of size 10x10. It then iterates over the range 1 to N, and for each number i, it checks if i % 10 > 0. If it is, it increments the count of the pair (i / 10, i % 10) in the array num. After that, it iterates over the range 1 to 9, and for each pair (i, j), it adds the product of the counts of the pair (i, j) and (j, i) to the variable c. Finally, it prints the value of c.
