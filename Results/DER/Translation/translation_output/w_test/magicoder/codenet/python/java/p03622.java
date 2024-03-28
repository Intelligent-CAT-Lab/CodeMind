<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[m];
        int[] g = new int[m];
        int i = 1;
        f[0] = 1;
        while (i < m) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[m - 1] = (int) Math.pow(M * f[m - 1], m - 2) % m;
        i = m - 1;
        while (i > 0) {
            g[i - 1] = (g[i] * i) % m;
            i--;
        }
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int k = 1;
        i = 0;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the values of `f` and `g` arrays, and then calculates the result based on the given formula. The result is then printed to the standard output.<｜end▁of▁sentence｜>
