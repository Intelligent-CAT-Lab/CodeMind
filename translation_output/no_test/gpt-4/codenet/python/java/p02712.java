Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class SumNonMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java code does essentially the same thing as the provided Python code: It reads an integer from the standard input, sums all numbers from 1 to N that are not multiples of 5 or 3, and then prints the total sum. Note that in Java, we need to import the Scanner class for getting input from the user, and we need to close the scanner at the end of the program to release the resource. Additionally, in Java, every statement is terminated with a semicolon.
