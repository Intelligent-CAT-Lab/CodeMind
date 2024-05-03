Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calculates the number of times you can double the number until it is greater than the input number. It then prints out the number of times it doubled.
