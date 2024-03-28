<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4 2

Expected output:
5 3


```
a,b,k=map(int,input().split())
turn=0
for i in range(k):
    if(turn==0):
        if(a%2==0):
            b+=a//2
            a-=a//2
        else:
            a-=1
            b+=a//2
            a-=a//2
        turn=1
    else:
        if(b%2==0):
            a+=b//2
            b-=b//2
        else:
            b-=1
            a+=b//2
            b-=b//2
        turn=0
print(a,b)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int turn = 0;
        for (int i = 0; i < k; i++) {
            if (turn == 0) {
                if (a % 2 == 0) {
                    b += a / 2;
                    a -= a / 2;
                } else {
                    a -= 1;
                    b += a / 2;
                    a -= a / 2;
                }
                turn = 1;
            } else {
                if (b % 2 == 0) {
                    a += b / 2;
                    b -= b / 2;
                } else {
                    b -= 1;
                    a += b / 2;
                    b -= b / 2;
                }
                turn = 0;
            }
        }
        System.out.println(a + " " + b);
    }
}
```

This Java code does exactly the same thing as the Python code. It reads three integers from the input, then performs the specified operations for the number of times specified by the third integer. After each operation, it prints the current values of the two integers.
<|EOT|>
