System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-77

```
n,k = map(int, input().split())
if k > n:
    print(0)
    quit()
ans = 1
for i in range(1,k):
    ans *= n-i
    ans //= i
ans %= 1000000007
print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 1;
        if (k > n) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < k; i++) {
            ans *= (n - i);
            ans /= i;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```

Test input:
5 3

Expected output:
-77<|endoftext|>
