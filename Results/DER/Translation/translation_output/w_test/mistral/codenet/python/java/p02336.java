<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
6


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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k > n) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
        }
        ans %= 1000000007;
        System.out.println(ans);
    }
}
```</s>
