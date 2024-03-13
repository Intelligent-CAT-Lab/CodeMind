<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K > ((N-1)*(N-2))/2) {
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println(N-1+((N-1)*(N-2))/2-K);

        for (int i = 2; i <= N; i++) {
            System.out.println("1 " + i);
        }

        int a = 0;
        for (int i = 2; i < N; i++) {
            for (int j = i+1; j <= N; j++) {
                if (a < ((N-1)*(N-2))/2-K) {
                    System.out.println(i + " " + j);
                    a += 1;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if the second integer is greater than the maximum possible edges in a complete graph with the first integer as the number of vertices, and if so, prints -1 and exits. Otherwise, it prints the number of edges in the complete graph minus the second integer, and then prints all possible edges in the graph.<｜end▁of▁sentence｜>
