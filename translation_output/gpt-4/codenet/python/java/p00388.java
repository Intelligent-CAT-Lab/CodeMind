Below is the equivalent Java code for the given Python snippet. I've assumed that you want to handle user input in a similar way as in Python, using `Scanner` to read from standard input.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        for (int c = a; c <= b; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
```

This code reads three integer values `h`, `a`, and `b` from standard input, much like the `input().split()` does in Python. The `range(b-a+1)` is equivalent to the loop `for (int c = a; c <= b; c++)`. Lastly, the `count` variable performs the same task as `.count(True)`, keeping track of the number of times the condition is met.
