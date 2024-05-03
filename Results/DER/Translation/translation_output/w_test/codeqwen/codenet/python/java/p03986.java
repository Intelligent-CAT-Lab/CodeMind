Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    continue;
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }
        System.out.println(memo * 2);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is 'T', it checks if the current value of `memo` is 0. If it is, it does nothing. If it's not, it decreases `memo` by 1. If the character is not 'T', it increases `memo` by 1. After the loop, it prints the final value of `memo` multiplied by 2.
