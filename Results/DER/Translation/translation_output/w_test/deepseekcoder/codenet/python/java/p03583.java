<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2


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
                    if (tmp1 == (tmp2 * s) && s >= 0) {
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, then iterates over a range of 1 to 3500 for both `i` and `j`. For each pair of `i` and `j`, it calculates `tmp1` and `tmp2` as per the Python code, then checks if `tmp2` is not zero and if `tmp1` is a multiple of `tmp2`. If these conditions are met, it sets `n`, `h`, and `w` to `i`, `j`, and `s` respectively and prints them. The function then returns.
<|EOT|>
