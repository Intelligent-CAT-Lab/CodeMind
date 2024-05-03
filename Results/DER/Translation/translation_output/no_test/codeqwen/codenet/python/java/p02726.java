Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        int y = Integer.parseInt(input[2]);

        int[] ans = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = j - i;
                int b = Math.abs((y - 1) - j) + Math.abs(i - (x - 1)) + 1;
                ans[Math.min(a, b) - 1] += 1;
            }
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, creates an array of size `n-1`, and then iterates over all pairs of indices `(i, j)` where `i < j`. For each pair, it calculates the minimum of `(j-i)` and `(abs((y-1)-j)+abs(i-(x-1))+1)`, and increments the corresponding element in the `ans` array. Finally, it prints out all elements of the `ans` array.
