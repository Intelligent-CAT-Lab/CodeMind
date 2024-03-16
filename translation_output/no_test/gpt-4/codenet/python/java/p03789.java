Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input and storing digits in a list after reversing
        String input = sc.nextLine();
        List<Integer> n = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            n.add(Character.getNumericValue(ch));
        }
        Collections.reverse(n);

        int lb = 0, ub = n.size();

        // Check function translated to Java
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
        sc.close();
    }

    // Defining the check function as a static method in Java
    private static boolean check(int x, List<Integer> n) {
        int g = 0;
        for (int i : n) {
            x -= (x + g - i) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

Please note that in Java, the input must be captured differently than in Python, and the division operator `/` already performs integer division when applied to two integers, so there's no need for an equivalent to the `//` operator in Python. Also, Java has strict type usage, so variable types must be declared explicitly. A `Scanner` is used to capture input from standard input, and an `ArrayList` is required instead of a Python list because Java does not have a built-in list structure that can change size dynamically. The `check` function is implemented as a static method because it doesn't need access to instance-level data.
