<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
-22 -91 67

```
import math
N, K = map(int,input().split())
if (2*N)*(K+ K+2*N-1) > N*(K+2*N + K+3*N-1):
    print(-1)
    exit()
flag = [1]*(2*N)
for i in range(math.floor(N/2),N):
    a = K + i
    b = K + 2*N -1 -(i-math.floor(N/2))*2
    c = K + 3*N -1 -(i-math.floor(N/2))
    print(a,b,c)
for i in range(math.floor(N/2)):
    a = K + i
    b = K + 2*N -2 -i*2
    c = K + 3*N -1 -i-math.ceil(N/2)
    print(a,b,c)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (2 * N) * (K + K + 2 * N - 1) > N * (K + 2 * N + K + 3 * N - 1)) {
            System.out.println(-1);
            return;
        }
        int[] flag = new int[2 * N];
        for (int i = (int) Math.floor(N / 2); i < N; i++) {
            int a = K + i;
            int b = K + 2 * N - 1 - (i - (int) Math.floor(N / 2)) * 2;
            int c = K + 3 * N - 1 - (i - (int) Math.floor(N / 2));
            System.out.println(a + " " + b + " " + c);
        }
        for (int i = 0; i < (int) Math.floor(N / 2); i++) {
            int a = K + i;
            int b = K + 2 * N - 2 - i * 2;
            int c = K + 3 * N - 1 - i - (int) Math.ceil(N / 2);
            System.out.println(a + " " + b + " " + c);
        }
    }
}
```
Note: The code uses the `Math.floor()` and `Math.ceil()` methods to perform the necessary calculations. The `Scanner` class is used to read the input from the user.</s>
