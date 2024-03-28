<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4 2

Expected output:
-67 -39

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

@@ Response
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

This Java code does the same thing as the Python code. It reads three integers from the standard input, then performs the same operations as the Python code. The result is printed to the standard output.<｜end▁of▁sentence｜>
