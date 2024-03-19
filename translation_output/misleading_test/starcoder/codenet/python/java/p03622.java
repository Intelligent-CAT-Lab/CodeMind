<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
499122087

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[M];
        int[] g = new int[M];
        int i = 1;
        f[0] = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[0] = 1;
        g[1] = 1;
        i = 2;
        while (i < M) {
            g[i] = (g[i - 1] * i) % m;
            i++;
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int k = 1;
        int ans = 0;
        while (j <= B) {
            ans += k * f[A + B - j] * g[B - j];
            k = k * 2 % m;
            j++;
        }
        System.out.println(ans % m);
    }
}
```

'''
<|endoftext|>
