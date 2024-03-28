Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        if ((x == 1 || x == 2 * N - 1) && N != 1) {
            System.out.println("No");
            return;
        }

        if (N == 1) {
            System.out.println("Yes");
            System.out.println(1);
            return;
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }

        int[] ans = new int[2 * N - 1];
        int index = 0;
        for (int i = N + x - 1; i >= 2 * N - 1; i--) {
            ans[index++] = i;
        }
        for (int i = 1; i < N + x; i++) {
            ans[index++] = i;
        }

        if (!smaller) {
            for (int i = 0; i < ans.length; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }

        System.out.println("Yes");
        for (int i : ans) {
            System.out.println(i);
        }

        scanner.close();
    }
}
```

This Java code follows similar logic to the original Python code. It takes input numbers `N` and `x`, checks special cases, creates an array of the answer, and then prints each element in the answer. The scanner is used for input and is closed at the end as a best practice in Java programming.
