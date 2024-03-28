<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4000 2000 500

Expected output:
5


```
K, A, B = map(int, input().split())
if A <= B and K > A:
    print(-1)
elif A >= K:
    print(1)
else:
    print(1 - int(- (K-A) // (A-B))*2)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            System.out.println(1 - (K - A) / (A - B));
        }
    }
}
```</s>
