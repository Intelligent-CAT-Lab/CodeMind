System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
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

Test input:
5 4 2

Expected output:
-67 -39<|endoftext|>
