<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


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
[/INST]
```python
import sys

def main():
    input_str = sys.stdin.readline().strip()
    input_list = list(input_str)
    result = 0
    p = 0
    g = 1

    for i in range(1, len(input_list)):
        if input_list[i] == 'g':
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

if __name__ == "__main__":
    main()
```
This is a Python implementation of the provided Java code. The code reads a string from standard input, converts it to a list of characters, and then iterates over the list to calculate the result. The result is then printed to standard output.

Note that the code uses the `sys` module to read from standard input and the `list` function to convert the input string to a list of characters. The `range` function is used to iterate over the list of characters.</s>
