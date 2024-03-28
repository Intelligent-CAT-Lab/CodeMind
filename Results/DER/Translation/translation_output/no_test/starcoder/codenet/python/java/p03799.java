<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (2 * n <= m) {
            System.out.println(n + (m - 2 * n) / 4);
        } else {
            System.out.println(m / 2);
        }
    }
}
```
'''
<|endoftext|>
