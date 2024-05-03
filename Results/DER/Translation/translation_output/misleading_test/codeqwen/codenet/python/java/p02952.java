Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String hoge = Integer.toString(i);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then iterates from 1 to that integer. For each number, it converts it to a string and checks if the length of the string is odd. If it is, it increments the `ans` variable. Finally, it prints out the value of `ans`.
