Here's the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int x = Integer.parseInt(inputs[1]);
        int y = Integer.parseInt(inputs[2]);

        int[] ans = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = j - i;
                int b = Math.abs((y - 1) - j) + Math.abs(i - (x - 1)) + 1;
                ans[Math.min(a, b) - 1]++;
            }
        }

        for (int i : ans) {
            System.out.println(i);
        }

        scanner.close();
    }
}
```

In this Java version, we read and parse the input using `Scanner`, and instead of list comprehensions as in Python, we manually parse each input to an integer. We then proceed with similar logic, using arrays and loops to calculate the frequencies.

Remember to use the `java.util.Scanner` for input handling in Java, and to close the `scanner` at the end to avoid resource leaks.
