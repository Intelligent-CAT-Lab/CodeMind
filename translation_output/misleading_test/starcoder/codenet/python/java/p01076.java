<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
-21

```
# AOJ 1591 Graph Making
# Python3 2018.7.13 bal4u

n, d = map(int, input().split())
if d == 1: print(n*(n-1)//2)
else: print((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2))

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }
    }
}
```

'''
<|endoftext|>
