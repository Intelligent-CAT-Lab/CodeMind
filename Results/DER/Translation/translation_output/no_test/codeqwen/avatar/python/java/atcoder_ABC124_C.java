Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1 += 1;
                } else {
                    cnt2 += 1;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2 += 1;
                } else {
                    cnt1 += 1;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of '0's and '1's at even and odd indices, and then prints the minimum of these two counts.
