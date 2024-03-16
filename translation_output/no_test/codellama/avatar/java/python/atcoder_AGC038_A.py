<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x;
                if (j < a ^ i < b) {
                    x = 1;
                } else {
                    x = 0;
                }
                sb.append(x);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

h, w, a, b = map(int, sys.stdin.readline().split())

for i in range(h):
    for j in range(w):
        if j < a ^ i < b:
            print(1, end="")
        else:
            print(0, end="")
    print()
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input string to a list of integers, and the `range` function is used to iterate over the rows and columns of the grid. The `^` operator is used to perform the XOR operation on the indices `j` and `i`. The `print` function is used to print the output, with the `end` parameter set to `""` to avoid printing a newline character at the end of each line.</s>
