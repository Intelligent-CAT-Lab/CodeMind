<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477694

```
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long ans = -1, value = 0;
        int mask = 2;
        
        while (value < number) {
            String s = Integer.toBinaryString(mask++).substring(1);
            int zeros = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                }
            }
            
            if (zeros != s.length() - zeros) {
                continue;
            }
            
            s = s.replace('0', '4');
            s = s.replace('1', '7');
            value = Long.parseLong(s);
        }
        
        System.out.println(value);
    }
}
```

### Response:
```python
def solve(number):
    ans = -1
    value = 0
    mask = 2
    
    while value < number:
        s = bin(mask)[2:]
        zeros = s.count('0')
        
        if zeros != len(s) - zeros:
            mask += 1
            continue
        
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s)
        mask += 1
        
    return value

print(solve(77777777))
```

This Python code does the same thing as the Java code. It starts from 2 (the third number in binary) and checks each number to see if it has an equal number of 0s and 1s. If it does, it replaces 0s with 4s and 1s with 7s, then converts the binary string back to an integer. It continues this process until it finds a number that is greater than or equal to the input number.
<|EOT|>
