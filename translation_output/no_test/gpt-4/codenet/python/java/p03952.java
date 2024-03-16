Below is the equivalent Java code for the Python code you provided. Please note that Java is more verbose and has different syntax and conventions compared to Python:

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                System.exit(0);
            } else {
                System.out.println("Yes");
                System.out.println(1);
                System.exit(0);
            }
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 2 * N - 1; i >= N + x; i--) {
            ans.add(i);
        }
        for (int i = 1; i < N + x; i++) {
            ans.add(i);
        }
        if (!smaller) {
            for (int i = 0; i < ans.size(); i++) {
                ans.set(i, 2 * N - ans.get(i));
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        scanner.close();
    }
}
```
Please note a few things:
- Java requires explicit type declarations.
- Java uses `Scanner` for reading inputs.
- Java arrays and collections use different methods and are not as straightforward to manipulate as Python lists.
- In Java, we typically use a loop instead of list comprehensions to populate a list.
- System.exit(0) is used to terminate the Java program, which has the same effect as `sys.exit()` in Python.
- I have used `ArrayList` to store and manipulate the sequence of numbers, as it is the closest equivalent to a Python list.
