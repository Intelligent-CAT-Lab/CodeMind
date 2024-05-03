Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * (int) Math.pow(10, s.length() - i - 1, 2019);
            ans += remain[now % 2019];
            remain[now % 2019] += 1;
        }
        ans += remain[0];
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, calculates the remainder of the number when divided by 2019, and keeps track of the number of times each remainder has occurred. It then adds up the number of times each remainder has occurred and prints the result.
