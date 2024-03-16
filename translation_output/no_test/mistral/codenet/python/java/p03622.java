<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int[] m = new int[] {476, 1};
        int[] f = new int[M];
        int[] g = new int[M];
        int i = 0;
        while (i < M) {
            f[i] = f[i - 1] * i % m[0];
            i++;
        }
        int j = 0;
        while (j < M) {
            g[j] = (int) Math.pow(M * f[j], m[1] - 2, m[0]);
            j++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = scanner.nextInt();
        System.out.print("Enter B: ");
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int k = 1;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m[0];
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m[0]);
    }
}
```</s>
