<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = -1;
        for (int i = 0; i < 30; i++) {
            if ((1 << i) > l) {
                d = i - 1;
                break;
            }
        }

        int n = d + 2;
        int m = 2 * d;
        List<String> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(i + " " + (i + 1) + " 0");
            ans.add(i + " " + (i + 1) + " " + (1 << (i - 1)));
        }

        while (l >= (1 << d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (1 << (i - 1)) >= (1 << d)) {
                    ans.add(i + " " + n + " " + (l - (1 << (i - 1))));
                    m++;
                    l -= (1 << (i - 1));
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (String a : ans) {
            System.out.println(a);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the maximum power of 2 that is less than or equal to the input number, and then generates the corresponding output. The output is printed to the standard output.
<|EOT|>
