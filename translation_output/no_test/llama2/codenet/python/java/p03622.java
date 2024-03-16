<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        int m = M * 476 + 1;
        int f = 1;
        int g = 1;
        int i = 1;
        int j = 1;
        int k = 1;
        while (i < M) {
            f += f[i % m] * i % m;
            i++;
        }
        g += Math.pow(M * f[0], m - 2, m);
        while (i > 0) {
            g[i - 1] = g[i] * i % m;
            i--;
        }
        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        if (A < B) {
            A = B;
            B = A;
        }
        int j = 1;
        int k = 1;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = k * 2 % m;
            j++;
        }
        int ans = (i * f[B] * g[A + B] + A) % m;
        System.out.println(ans);
    }
}
```
</s>
