<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1 2 3


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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if ((2*N)*(K+ K+2*N-1) > N*(K+2*N + K+3*N-1)) {
            System.out.println(-1);
            System.exit(0);
        }
        boolean[] flag = new boolean[2*N];
        for (int i = (int)Math.floor(N/2); i < N; i++) {
            int a = K + i;
            int b = K + 2*N -1 -(i-(int)Math.floor(N/2))*2;
            int c = K + 3*N -1 -(i-(int)Math.floor(N/2));
            System.out.println(a + " " + b + " " + c);
        }
        for (int i = 0; i < (int)Math.floor(N/2); i++) {
            int a = K + i;
            int b = K + 2*N -2 -i*2;
            int c = K + 3*N -1 -i-(int)Math.ceil(N/2);
            System.out.println(a + " " + b + " " + c);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if the condition is met, and if it is, it prints the numbers in the specified format. If the condition is not met, it prints -1 and exits.
<|EOT|>
