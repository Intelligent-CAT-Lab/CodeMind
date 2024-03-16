<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
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
                    int m = tmp1 % tmp2;
                    if (m == 0 && s >= 0) {
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

This Java code does the same thing as the Python code. It reads an integer from the user, then iterates over all possible values of `i` and `j`, calculating `tmp1` and `tmp2` as in the Python code. If `tmp2` is not zero, it calculates `s` and `m`, and if `m` is zero and `s` is non-negative, it updates `n`, `h`, and `w` and prints them. If it finds such values, it immediately stops the loop.<｜end▁of▁sentence｜>
