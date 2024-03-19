<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
46

```
n=int(input())
ant,bnt,cnt=1,1,1

for i in range(n) :
    ant=10*ant%1000000007
    bnt=9*bnt%1000000007
    cnt=8*cnt%1000000007

ans=(ant-(bnt*2-cnt))%1000000007

if ans>=0 :
    print(ans)
else :
    print(1000000007+ans) 
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ant = 1, bnt = 1, cnt = 1;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % 1000000007;
            bnt = (9 * bnt) % 1000000007;
            cnt = (8 * cnt) % 1000000007;
        }

        long ans = (ant - (2 * bnt - cnt)) % 1000000007;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then calculates the values of `ant`, `bnt`, and `cnt`, and finally calculates the value of `ans`. If `ans` is non-negative, it prints `ans`; otherwise, it prints `1000000007 + ans`.<｜end▁of▁sentence｜>
