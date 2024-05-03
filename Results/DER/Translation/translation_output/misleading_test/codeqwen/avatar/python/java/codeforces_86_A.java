Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        int[] arr = {l, r, first, second};
        for (int i : arr) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                while (curr > 0) {
                    rev.append(9 - curr % 10);
                    curr /= 10;
                }
                ans = Math.max(ans, Integer.parseInt(rev.toString()) * i);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the number of digits in the range, and then iterates over the range to find the maximum value that can be obtained by reversing the digits of the number. The result is printed to the console.
