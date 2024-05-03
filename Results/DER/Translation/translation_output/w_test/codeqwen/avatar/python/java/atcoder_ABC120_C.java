Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num_0 += 1;
            } else {
                num_1 += 1;
            }
        }
        System.out.println(Math.min(num_0, num_1) * 2);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of '0's and '1's in the string, and then prints the minimum of these two numbers multiplied by 2.
