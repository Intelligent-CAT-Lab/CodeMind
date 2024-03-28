<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
