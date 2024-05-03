Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        int N = A.length();

        int C0 = 0;
        int C1 = 0;

        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') {
                C0++;
            } else if (A.charAt(i) == '1') {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of '0's and '1's in the string, and then prints the minimum of these two counts multiplied by 2.
