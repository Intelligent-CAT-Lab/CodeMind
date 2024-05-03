Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 1) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, counts the number of integers from 1 to the input number that have an odd number of digits, and then prints the count.
