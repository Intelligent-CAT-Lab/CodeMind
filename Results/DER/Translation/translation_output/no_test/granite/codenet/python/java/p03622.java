System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        int[] m = new int[1];
        int[] f = new int[M + 1];
        int[] g = new int[M];
        int[] i = new int[1];
        f[1] = 1;
        i[0] = 1;
        g[0] = 1;
        int j = 1;
        while (i[0] < M) {
            f[i[0] + 1] = (int) ((long) f[i[0]] * i[0] % m[0]);
            i[0]++;
        }
        j = 1;
        while (j <= M) {
            g[M - j] = (int) ((long) g[M - j + 1] * (M - j + 1) % m[0]);
            j++;
        }
        String[] input = args[0].split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        j = 1;
        int k = 1;
        int result = 0;
        while (j <= B) {
            result = (result + (int) ((long) k * f[A + B - j] * g[B - j] % m[0])) % m[0];
            k = (k * 2) % m[0];
            j++;
        }
        result = (int) ((long) result * f[B] * g[A + B] % m[0]);
        result = (result + A) % m[0];
        System.out.println(result);
    }
}
```<|endoftext|>
