<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def MI(): return map(int,sys.stdin.readline().rstrip().split())

N,K = MI()

if K > ((N-1)*(N-2))//2:
    print(-1)
    exit()

print(N-1+((N-1)*(N-2))//2-K)

for i in range(2,N+1):
    print(1,i)

a = 0
for i in range(2,N):
    for j in range(i+1,N+1):
        if a < ((N-1)*(N-2))//2-K:
            print(i,j)
            a += 1

```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (K > ((N - 1) * (N - 2)) / 2) {
            System.out.println(-1);
            return;
        }
        System.out.println(N - 1 + ((N - 1) * (N - 2)) / 2 - K);
        for (int i = 2; i <= N; i++) {
            System.out.println(1, i);
        }
        int a = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (a < ((N - 1) * (N - 2)) / 2 - K) {
                    System.out.println(i, j);
                    a += 1;
                }
            }
        }
    }
}
```
</s>
