<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int a = 1, b = N / 2;
        int c = N / 2 + (N % 2 == 0 ? 1 : 0), d = N;
        int i = 0;

        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i++;
                c++;
                d--;
            } else {
                break;
            }

            if (i < M) {
                System.out.println(a + " " + b);
                a++;
                b--;
                i++;
            } else {
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then prints pairs of numbers in a specific order. The condition ```i<M``` is used to ensure that the loop doesn't go beyond the number of pairs to print. The ```(N % 2 == 0 ? 1 : 0)``` part is a ternary operator that checks if N is even, and if it is, adds 1 to c, otherwise it leaves c unchanged.
<|EOT|>
