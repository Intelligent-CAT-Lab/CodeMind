<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = N = a = 1;
        while (true) {
            N = (K + a - 1) / K;
            a += N;
            if (N < a) {
                break;
            }
            t++;
        }
        System.out.println(t);
    }
}
```</s>
