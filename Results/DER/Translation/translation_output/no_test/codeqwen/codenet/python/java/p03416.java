Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int f = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int count = 0;
        for (int i = f; i <= t; i++) {
            String str = Integer.toString(i);
            String reversedStr = new StringBuilder(str).reverse().toString();
            if (str.equals(reversedStr)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then it iterates over all integers from `f` to `t` (inclusive). For each integer, it converts it to a string, then reverses the string. If the original string and the reversed string are the same, it increments a counter. Finally, it prints the count.
