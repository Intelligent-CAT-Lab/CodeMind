<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
499122178


```
M=8**7
m,f,g,i=M*476+1,[j:=1],[k:=1]*M,1
while i<M:f+=f[-1]*i%m,;i+=1
g+=pow(M*f[-1],m-2,m),
while i:g[i-1]=g[i]*i%m;i-=1
A,B=map(int,input().split())
if A<B:A,B=B,A
while j<=B:i+=k*f[A+B-j]*g[B-j];k=k*2%m;j+=1
print((i*f[B]*g[A+B]+A)%m)
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[(int) m + 1];
        f[0] = 1;
        long[] g = new long[(int) m + 1];
        g[0] = 1;
        long i = 1;
        while (i < M) {
            f[(int) i] = (f[(int) i - 1] * i % m);
            i++;
        }
        g[(int) i] = (long) (Math.pow(M * f[(int) i - 1], m - 2) % m);
        while (i > 0) {
            g[(int) i - 1] = (g[(int) i] * i % m);
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        if (A < B) {
            long temp = A;
            A = B;
            B = temp;
        }
        long j = 1;
        long k = 1;
        long sum = 0;
        while (j <= B) {
            sum += k * f[(int) (A + B - j)] * g[(int) (B - j)];
            k = k * 2 % m;
            j++;
        }
        System.out.println(((sum * f[(int) B] * g[(int) (A + B)] + A) % m));
    }
}
```

This Java code does the same thing as the Python code. It calculates the value of a function based on the input values A and B. The function is defined in the Python code and is used to calculate the result. The result is then printed out.
<|EOT|>
