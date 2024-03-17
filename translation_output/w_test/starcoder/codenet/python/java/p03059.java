<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
10


```
a, b, t = map(int, input().split())
print((t // a) * b)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        System.out.println((t / a) * b);
    }
}
```
"""

import sys

a, b, t = map(int, sys.stdin.readline().split())
print((t // a) * b)
<|endoftext|>
