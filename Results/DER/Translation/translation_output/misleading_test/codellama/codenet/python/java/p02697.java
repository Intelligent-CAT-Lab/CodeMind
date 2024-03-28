<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 1, b = N / 2;
        int c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a += 1;
        }
        for (int i = 0; i < M; i++) {
            System.out.println(c + " " + d);
            c += 1;
            d -= 1;
            System.out.println(a + " " + b);
            a += 1;
            b -= 1;
        }
    }
}
```
This code first takes input from the user for two integers N and M. It then initializes two variables a and b with values 1 and N/2, and two variables c and d with values N/2+1 and N. If N is even, it increments the value of a by 1.

The code then enters a for loop that runs for M iterations. In each iteration, it prints the values of c and d, and then increments c by 1 and decrements d by 1. It then prints the values of a and b, and increments a by 1 and decrements b by 1.

The code then exits the for loop and the program terminates.

Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console.</s>
