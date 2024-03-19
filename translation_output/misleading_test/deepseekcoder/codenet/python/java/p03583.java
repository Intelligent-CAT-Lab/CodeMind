<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2 -18

```
N = int(input())
n = 0
h = 0
w = 0

for i in range(1, 3501):
    for j in range(1, 3501):
        tmp1 = N * i * j
        tmp2 = (4 * i * j) - (N * j) - (N * i)
        if tmp2 != 0:
            s, m = divmod(tmp1, tmp2)
            if m == 0 and s >= 0:
                n, h, w = i, j, s
                print(n, h, w)
                exit()

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 0;
        int h = 0;
        int w = 0;

        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                int tmp1 = N * i * j;
                int tmp2 = (4 * i * j) - (N * j) - (N * i);
                if (tmp2 != 0) {
                    int s = tmp1 / tmp2;
                    if (tmp1 == s * tmp2 && s >= 0) {
                        n = i;
                        h = j;
                        w = s;
                        System.out.println(n + " " + h + " " + w);
                        return;
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` from the input, then iterates over possible values of `i` and `j`, calculating `tmp1` and `tmp2` as in the Python code. If `tmp2` is not zero and `tmp1` is a multiple of `tmp2` (i.e., `tmp1` divided by `tmp2` gives an integer result), it updates `n`, `h`, and `w` and prints them.
<|EOT|>
