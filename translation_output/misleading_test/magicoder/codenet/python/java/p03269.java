<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
 4
1 2 0
12 1
2 3 (0
q2 3 2

```
l = int(input())

d = max([d for d in range(30) if 2**d <= l])
n = d+1
m = 2*d
ans = []
for i in range(1, n):
    ans.append((i, i+1, 0))
    ans.append((i, i+1, 2**(i-1)))

while l > 2**d:
    for i in range(n-1, 0, -1):
        if l-2**(i-1) > 2**d-1:
            ans.append((i, n, l-2**(i-1)))
            m += 1
            l -= 2**(i-1)
            break

print(n, m)
for a in ans:
    print(*a)
```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = (int) (Math.log(l) / Math.log(2));
        int n = d + 1;
        int m = 2 * d;

        int[][] ans = new int[m][3];
        int index = 0;

        for (int i = 1; i < n; i++) {
            ans[index][0] = i;
            ans[index][1] = i + 1;
            ans[index][2] = 0;
            index++;

            ans[index][0] = i;
            ans[index][1] = i + 1;
            ans[index][2] = (int) Math.pow(2, i - 1);
            index++;
        }

        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans[index][0] = i;
                    ans[index][1] = n;
                    ans[index][2] = (int) (l - Math.pow(2, i - 1));
                    m++;
                    l -= (int) Math.pow(2, i - 1);
                    index++;
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the maximum power of 2 that is less than or equal to the input, and then generates the output as described in the Python code.<｜end▁of▁sentence｜>
