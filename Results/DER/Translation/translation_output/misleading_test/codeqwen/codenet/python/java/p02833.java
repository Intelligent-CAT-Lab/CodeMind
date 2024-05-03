Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = 10;
        int tot = 0;
        if (n % 2 == 1) {
            System.out.println(0);
        } else {
            while (n >= div) {
                tot += (n / div);
                div *= 5;
            }
            System.out.println(tot);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the total number of 5's in the factorization of the number, and prints the result.
