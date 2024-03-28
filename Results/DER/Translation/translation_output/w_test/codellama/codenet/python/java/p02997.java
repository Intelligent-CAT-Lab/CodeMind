<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K > ((N-1)*(N-2))/2) {
            System.out.println(-1);
            return;
        }

        System.out.println(N-1+((N-1)*(N-2))/2-K);

        for (int i = 2; i <= N; i++) {
            System.out.println(1 + " " + i);
        }

        int a = 0;
        for (int i = 2; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (a < ((N-1)*(N-2))/2-K) {
                    System.out.println(i + " " + j);
                    a++;
                }
            }
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output. The logic is similar to the Python code, with a few minor differences in syntax.</s>
