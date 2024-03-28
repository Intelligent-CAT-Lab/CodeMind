<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2


```
x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        ans += q;
        r = r % 6;
        if (r > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the number of 2's and 1's that can be obtained by dividing the number by 11 and 6 respectively, and adds them to the answer. If the remainder is greater than 0, it adds 1 to the answer. The result is then printed to the standard output.<｜end▁of▁sentence｜>
