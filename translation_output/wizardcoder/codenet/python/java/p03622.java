Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[M];
        int[] g = new int[M];
        f[0] = 1;
        g[0] = 1;
        for (int i = 1; i < M; i++) {
            f[i] = (f[i - 1] * i) % m;
        }
        for (int i = 1; i < M; i++) {
            g[i] = (g[i - 1] * i) % m;
        }
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int i = 0;
        int j = 1;
        int k = 1;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        System.out.println(i % m);
    }
}
```<|endoftext|>
