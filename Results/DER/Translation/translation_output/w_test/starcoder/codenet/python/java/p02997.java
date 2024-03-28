<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
5
4 3
1 2
3 1
4 5
2 3


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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k > ((n-1)*(n-2))//2) {
            System.out.println(-1);
            return;
        }
        System.out.println(n-1+((n-1)*(n-2))//2-k);
        for(int i=2;i<=n;i++) {
            System.out.println(1+" "+i);
        }
        int a = 0;
        for(int i=2;i<n;i++) {
            for(int j=i+1;j<=n;j++) {
                if(a < ((n-1)*(n-2))//2-k) {
                    System.out.println(i+" "+j);
                    a++;
                }
            }
        }
    }
}
```
'''
<|endoftext|>
