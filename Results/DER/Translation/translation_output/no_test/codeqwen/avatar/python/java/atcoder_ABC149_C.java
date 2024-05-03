Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (true) {
            if (hoge(N)) {
                System.out.println(N);
                return;
            }
            N += 1;
        }
    }

    public static boolean hoge(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= Math.sqrt(n) + 1; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's prime, and if it's not, it increments the number until it finds a prime number. It then prints the prime number and exits the program.
