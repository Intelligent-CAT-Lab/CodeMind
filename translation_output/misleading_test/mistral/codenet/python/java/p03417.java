<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
54

```
N, M = map(int, input().split())

if max(N,M) == 1 :
    print(1)
elif min(N,M) == 1 :
    print(N*M - 2)
else :
    print((N-2)*(M-2))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;
        if (N == 1 && M == 1) {
            result = 1;
        } else if (N == 1 || M == 1) {
            result = N * M - 2;
        } else {
            result = (N - 2) * (M - 2);
        }
        System.out.println(result);
    }
}
```</s>
