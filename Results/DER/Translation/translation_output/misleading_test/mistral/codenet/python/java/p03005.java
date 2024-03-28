<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
31

```
N,K=map(int,input().split())
if K==1:
    print(0)
else:
    print(N-K)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```</s>
