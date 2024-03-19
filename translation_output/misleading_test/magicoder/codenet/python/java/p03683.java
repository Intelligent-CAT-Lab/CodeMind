<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-80

```
buf=input().split()
N=int(buf[0])
M=int(buf[1])

thres=10**9+7

if abs(N-M)==1:
    N=min(N,M)
    retVal=1
    for i in range(1,N+1):
        retVal*=(i**2)
        if retVal>=thres:
            retVal=retVal%thres
    retVal*=(N+1)
    if retVal>=thres:
        retVal=retVal%thres
    print(retVal) 
elif N==M:
    retVal=2
    for i in range(1,N+1):
        retVal*=(i**2)
        if retVal>=thres:
            retVal=retVal%thres
    print(retVal)
else:
    print(0)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split(" ");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);

        long thres = (long) Math.pow(10, 9) + 7;

        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= (i * i);
                if (retVal >= thres) {
                    retVal %= thres;
                }
            }
            retVal *= (N + 1);
            if (retVal >= thres) {
                retVal %= thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (i * i);
                if (retVal >= thres) {
                    retVal %= thres;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if the difference between them is 1 or if they are equal, and then calculates a result based on these conditions. The result is then printed to the standard output.<｜end▁of▁sentence｜>
