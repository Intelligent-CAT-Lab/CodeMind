<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m, f, g, i;
        m = M * 476 + 1;
        f = 1;
        g = new int[M];
        Arrays.fill(g, 1);
        i = 0;
        while (i < M) {
            f += f * i % m;
            i++;
        }
        g[0] = g[1] = 1;
        for (int j = 2; j < M; j++) {
            g[j] = g[j - 1] * j % m;
        }
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A < B) {
            A = B;
            B = A;
        }
        int result = 0;
        for (int j = 0; j <= B; j++) {
            result += k * f[A + B - j] * g[B - j];
            k = k * 2 % m;
        }
        System.out.println((result * f[B] * g[A + B] + A) % m);
    }
}
```</s>
