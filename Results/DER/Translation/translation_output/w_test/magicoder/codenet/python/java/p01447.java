<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
2


```
n = int(input())

ans = 0
tmp = 1
while n > tmp:
    tmp *= 3
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
        int n = scanner.nextInt();

        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes two variables `ans` and `tmp` to 0 and 1, respectively. Then it enters a loop where it multiplies `tmp` by 3 and increments `ans` until `n` is greater than `tmp`. Finally, it prints the value of `ans`.<｜end▁of▁sentence｜>
