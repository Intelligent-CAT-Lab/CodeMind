Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                return;
            } else {
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2 * N - 1; i >= N + x - 1; i--) {
            ans.add(i);
        }
        for (int i = 1; i <= N + x - 1; i++) {
            ans.add(i);
        }

        if (!smaller) {
            Collections.reverse(ans);
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers N and x from the standard input, checks if x is 1 or 2*N-1, and if so, prints "No" and returns. If x is greater than N, it sets smaller to false and sets x to 2*N-x. It then creates an ArrayList ans and fills it with the numbers from 2*N-1 to N+x-1 in reverse order, followed by the numbers from 1 to N+x-1.
