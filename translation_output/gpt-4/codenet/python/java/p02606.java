Sure, here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans += 1;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

Let me explain the translation process:

1. I used the `Scanner` class to handle user input, which is the Java equivalent for `input()` in Python.
2. In Java, you must declare the type of each variable, so I declared `L`, `R`, `d`, and `ans` as `int`.
3. Instead of a `range()` function like in Python, I used a standard `for` loop from `L` to `R` (inclusive).
4. The `if` statement remains the same, as both Java and Python use `%` to denote the modulus operator.
5. Lastly, I used `System.out.println` to output the result, which is the Java equivalent of `print()` in Python.
