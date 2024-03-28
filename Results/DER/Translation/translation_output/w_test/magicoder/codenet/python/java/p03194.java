<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 24

Expected output:
2


```
n, p = list(map(int, input().split()))

if n == 1 :
    print(p)
elif p == 1 :
    print(1)
elif n >= 40:
    print(1)
else:
    ans = 1
    count = 2
    tmp = count**n
    while (tmp) <= p:
        if(p % tmp == 0):
            ans *= count
            p = int(p/tmp)
            count -= 1
        count += 1
        tmp = count**n
    print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            int ans = 1;
            int count = 2;
            int tmp = (int) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count -= 1;
                }
                count += 1;
                tmp = (int) Math.pow(count, n);
            }
            System.out.println(ans);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then performs the same operations as the Python code.<｜end▁of▁sentence｜>
