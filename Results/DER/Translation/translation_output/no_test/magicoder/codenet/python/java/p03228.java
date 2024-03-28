<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
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
```<｜end▁of▁sentence｜>
