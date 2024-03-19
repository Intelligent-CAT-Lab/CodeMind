<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 5 1

Expected output:
YES

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
Here is the Java version of the provided Python code:

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
        scanner.close();
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

This Java code reads three integers from the standard input, and then calls the `foo` function with these integers as arguments. The `foo` function checks if `c` is reachable from `a` modulo `b`. If it is, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
