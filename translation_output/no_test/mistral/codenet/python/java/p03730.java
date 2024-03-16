<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;
import java.util.HashSet;

public class Foo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(foo(a, b, c));
    }

    public static int foo(int a, int b, int c) {
        HashSet<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (i != seen.contains(i)) {
            if (i == c) {
                return 1;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        return 0;
    }
}
```</s>
