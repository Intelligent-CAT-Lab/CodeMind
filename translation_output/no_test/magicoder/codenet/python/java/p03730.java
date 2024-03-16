<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.HashSet;
import java.util.Scanner;

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
        HashSet<Integer> seen = new HashSet<>();
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

This Java code does the same thing as the Python code. It reads three integers from the user, then calls the `foo` function with these integers. The `foo` function calculates the remainder of `a` divided by `b`, and then enters a loop where it adds the current value of `i` to the `seen` set and updates `i` to be the remainder of `m + i` divided by `b`. If `i` ever equals `c`, it prints "YES" and returns. If `i` ever appears in the `seen` set, it prints "NO" and returns.<｜end▁of▁sentence｜>
