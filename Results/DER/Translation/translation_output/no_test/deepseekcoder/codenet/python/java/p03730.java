<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c = list(map(int, input().split()))

def foo(a, b, c):
    seen = set()
    m = a % b
    i = m
    while i not in seen :
        if i == c:
            print("YES")
            return 
        seen.add(i)
        i = (m + i) % b
    print("NO")
foo(a, b, c)

```

### Response:
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        foo(a, b, c);
    }

    public static void foo(int a, int b, int c) {
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, and then calls the `foo` function with these three integers as arguments. The `foo` function checks if `c` is ever equal to `i` (which starts at `a % b`), and prints "YES" if it ever is, and "NO" otherwise. The `i` is updated in each iteration to be `(m + i) % b`. If `i` ever equals `c`, the function returns. If `i` ever equals a value that has been seen before, the function also returns.
<|EOT|>
