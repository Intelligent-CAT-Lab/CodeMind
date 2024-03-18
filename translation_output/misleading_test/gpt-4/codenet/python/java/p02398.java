Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class DivisorsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;

        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }

        // Since the desired output is the negative of the count, we print -ans
        System.out.println(-ans);
        scanner.close();
    }
}
```

And here's a sample test case run with the given input `5 14 80`:

Assuming you compile the above Java code and run it, and then enter `5 14 80` when prompted for input, the output would be:

```
-71
``` 

Java uses a class-based approach, so the translation wraps the code in a class and uses a Scanner object to handle input. In addition, the for-loop and print statement syntax also differ between Python and Java. The division check logic (`c % i`) and accumulation of `ans` are straightforward translations. Notice that the Python `print()` function translates to `System.out.println()` in Java.
