Certainly, here's the equivalent Java code for the Python code you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if (y == (i * 10000 + j * 5000 + (n - i - j) * 1000)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
```

This Java code snippet reads `n` and `y` from standard input, which are the number of bills and the total amount, respectively. It then performs loops to find a combination of bills (10,000 yen, 5,000 yen, and 1,000 yen notes) that sum up to the total amount `y`. If such a combination is found, it prints out the count of each bill in the required format and exits the `main` method, therefore terminating the program. If no combination is found that meets the requirement, it prints "-1 -1 -1".
