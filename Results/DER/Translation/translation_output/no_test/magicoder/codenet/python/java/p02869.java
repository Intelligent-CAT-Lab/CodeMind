<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
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
        int[] flag = new int[2*N];
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

Please note that Java does not have a built-in `exit()` function like Python. Instead, you can use `System.exit(0)` to terminate the program. Also, Java does not have a built-in `floor()` or `ceil()` function like Python. You can use `Math.floor()` and `Math.ceil()` to achieve the same functionality.<｜end▁of▁sentence｜>
