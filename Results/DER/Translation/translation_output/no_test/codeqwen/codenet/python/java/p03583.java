Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 0;
        int h = 0;
        int w = 0;

        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                int tmp1 = N * i * j;
                int tmp2 = (4 * i * j) - (N * j) - (N * i);
                if (tmp2 != 0) {
                    int s = tmp1 / tmp2;
                    int m = tmp1 % tmp2;
                    if (m == 0 && s >= 0) {
                        n = i;
                        h = j;
                        w = s;
                        System.out.println(n + " " + h + " " + w);
                        return;
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer N from the user, then it iterates over all possible values of i and j from 1 to 3500. For each pair of i and j, it calculates tmp1 and tmp2, and then checks if tmp2 is not zero. If it is not zero, it calculates s and m, and if m is zero and s is greater than or equal to zero, it updates n, h, and w, prints them, and exits the program. If no such pair of i and j is found, it does nothing.
