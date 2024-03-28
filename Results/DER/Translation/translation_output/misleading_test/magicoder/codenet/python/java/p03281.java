<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
105

Expected output:
25

```
n = int(input())

def cnt_divisor(n):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:
            cnt += 1
    return cnt

cnt = 0
for j in range(1, n+1):
    if j % 2 == 0:
        continue
    if cnt_divisor(j) == 8:
        cnt += 1

print(cnt)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
                if (cntDivisor(j) == 8) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then counts the number of odd numbers less than or equal to the input number that have exactly 8 divisors. The `cntDivisor` method is used to count the number of divisors of a number.<｜end▁of▁sentence｜>
