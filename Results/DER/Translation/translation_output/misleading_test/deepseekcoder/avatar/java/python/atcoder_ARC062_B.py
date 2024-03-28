<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
82

```
import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int result = 0;
        int p = 0;
        int g = 1;
        
        for (int i = 1; i < input.length; i++) {
            if (input[i] == 'g') {
                if (p + 1 <= g) {
                    result++;
                    p++;
                } else {
                    g++;
                }
            } else {
                if (p + 1 <= g) {
                    p++;
                } else {
                    g++;
                    result--;
                }
            }
        }
        
        System.out.println(result);
    }
}
```

### Response:
```python
import sys

def solve():
    input_str = sys.stdin.readline().strip()
    result = 0
    p = 0
    g = 1

    for i in range(1, len(input_str)):
        if input_str[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1

    print(result)

solve()
```

This Python code reads the input string from the standard input, and then iterates over the characters in the string. If the current character is 'g', it checks if the number of 'p' characters is less than or equal to the number of 'g' characters. If it is, it increments the result and the number of 'p' characters. If not, it increments the number of 'g' characters. If the current character is not 'g', it does the same as above, but decrements the result instead. Finally, it prints the result.
<|EOT|>
