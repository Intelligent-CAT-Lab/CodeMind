<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
32

```
def main():
    n = int(input())
    root = int(n ** (1 / 2)) + 1
    isPrime = [True] * (n + 3)
    for i in range(4, n + 3, 2):
        isPrime[i] = False
    
    ans = 0
    prePrime = -1
    for i in range(3, n + 3, 2):
        if isPrime[i]:
            if prePrime + 2 == i:
                ans += 2
                
            prePrime = i
            if i > root:
                continue
            for j in range(i * i, n + 3, i):
                isPrime[j] = False
    print(ans)

main()

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = (int) Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        Arrays.fill(isPrime, true);
        for (int i = 4; i <= n + 2; i += 2) {
            isPrime[i] = false;
        }
        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i <= n + 2; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j <= n + 2; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(ans);
    }
}
```</s>
