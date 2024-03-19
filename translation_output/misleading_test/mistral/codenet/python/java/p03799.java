<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6

Expected output:
-67

```
def INT():
    return int(input())

def MI():
    return map(int, input().split())

def LI():
    return list(map(int, input().split()))

N, M = MI()

if 2 * N <= M:
    ans = N + (M - 2 * N) // 4
    
else:
    ans = M // 2
    
print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (2 * N <= M) {
            int ans = (N + (M - 2 * N) / 4);
        } else {
            int ans = M / 2;
        }

        System.out.println(ans);
    }
}
```</s>
