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

This Java code does the same thing as your Python code. It reads an integer N from the user, then creates a 2D array num of size 10x10. It then iterates over the range 1 to N, and for each number i, it checks if i % 10 > 0. If it is, it increments the count of the first digit of i in the 2D array. Finally, it iterates over the 2D array and adds up the products of the counts of each pair of digits, then prints the result.
