<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPDPDP


```
import java.util.Scanner;

public class p02664 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == 'D' ||c[i]  ==  '?') {
                count++;
                c[i] = 'D';
            }
            System.out.print(c[i]);
        }
        System.out.print("\n");

    }

}
```

### Response:
```python
def p02664():
    c = input()
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c = c[:i] + 'D' + c[i+1:]
    print(c)

p02664()
```

This Python code does the same thing as the Java code. It reads a string from the input, then iterates over the string. If the character at a given position is 'D' or '?', it replaces the character with 'D' and increments the count. Finally, it prints the modified string.
<|EOT|>
