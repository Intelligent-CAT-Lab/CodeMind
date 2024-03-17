<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2

Expected output:
2


```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((int)Math.ceil((double)n/(2*d+1)));
    }
}
```

In Java, the equivalent code would be:

1. Import the `Scanner` class from the `java.util` package.
2. Create a new `Scanner` object to read input from the standard input (console).
3. Read the two integers `n` and `d` from the input.
4. Calculate the result by dividing `n` by `(2*d+1)` and rounding up to the nearest integer using the `Math.ceil` function.
5. Print the result.<｜end▁of▁sentence｜>
