<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477777


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

@@ Response
```python
def find_next_number(number):
    mask = 2
    while True:
        binary_str = bin(mask)[2:]
        zeros = binary_str.count('0')
        ones = binary_str.count('1')
        if zeros != ones:
            mask += 1
            continue
        binary_str = binary_str.replace('0', '4')
        binary_str = binary_str.replace('1', '7')
        value = int(binary_str, 2)
        if value > number:
            return value
        mask += 1

number = int(input())
print(find_next_number(number))
```

This Python code does the same thing as the Java code. It generates binary representations of numbers starting from 2, and replaces all '0's with '4's and all '1's with '7's. It then converts the binary string back to a number and checks if it's greater than the input number. If it is, it returns the number. If not, it continues with the next number.<｜end▁of▁sentence｜>
