<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int a = 1;
        int b = N / 2;
        int c = N / 2 + 1;
        int d = N;

        if (N % 2 == 0) {
            a += 1;
        }

        for (int i = 0; i < M; i++) {
            System.out.println(c + " " + d);
            c += 1;
            d -= 1;
        }

        for (int i = 0; i < M; i++) {
            System.out.println(a + " " + b);
            a += 1;
            b -= 1;
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `for` loop is used to iterate over the input values and print the output.</s>
