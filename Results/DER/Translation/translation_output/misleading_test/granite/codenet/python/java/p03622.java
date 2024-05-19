System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
public class Main {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int[] f = new int[M];
        int[] g = new int[M];
        int m = M * 476 + 1;
        int i = 1;
        f[0] = 1;
        while (i < M) {
            f[i] = (int) ((long) f[i - 1] * i % m);
            i++;
        }
        g[M - 1] = 1;
        i = M - 2;
        while (i >= 0) {
            g[i] = (int) ((long) g[i + 1] * (i + 1) % m);
            i--;
        }
        int A = 1;
        int B = 1;
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int k = 1;
        long iSum = 0;
        while (j <= B) {
            iSum += (long) k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        long result = (iSum * f[B] * g[A + B] + A) % m;
        System.out.println(result);
    }
}
```

Test input:
1 1

Expected output:
499122087<|endoftext|>
