<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
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
```</s>
