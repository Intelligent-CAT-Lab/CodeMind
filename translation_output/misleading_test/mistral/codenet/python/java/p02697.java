<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1

Expected output:
24 72

```
N,M=map(int,input().split())

a,b=1,N//2
c,d=N//2+1,N
if N%2==0:
    a+=1
i=0
while i<M:
    if i<M:
        print(c,d)
        i+=1        
        c,d=c+1,d-1
    else:
        break
    if i<M:
        print(a,b)
        a,b=a+1,b-1
        i+=1
    else:
        break

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int a = 1, b = N / 2, c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a++;
        }
        for (int i = 0; i < M; i++) {
            if (i < M) {
                System.out.println(c + ", " + d);
                c++;
                d--;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + ", " + b);
                a++;
                b--;
            } else {
                break;
            }
        }
    }
}
```</s>
