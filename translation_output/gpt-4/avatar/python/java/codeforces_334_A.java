Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;

        while (i < j) {
            System.out.println(i + " " + j);
            i += 1;
            j -= 1;
        }
        scanner.close();
    }
}
```

This Java code takes an input integer `n`, initializes `i` to 1, and `j` to n squared. Then, it enters a loop where it prints the values of `i` and `j` until `i` is no longer less than `j`, incrementing `i` by 1 and decrementing `j` by 1 each iteration. The code includes the necessary imports and closes the scanner to prevent any resource leak.
