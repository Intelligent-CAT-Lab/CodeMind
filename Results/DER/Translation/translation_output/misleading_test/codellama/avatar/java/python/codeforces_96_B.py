<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    number = int(sys.stdin.readline().strip())
    ans = -1
    value = 0
    mask = 2

    while value < number:
        s = bin(mask)[2:]
        zeros = 0

        for c in s:
            if c == '0':
                zeros += 1

        if zeros != len(s) - zeros:
            mask += 1
            continue

        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s, 2)

    print(value)

if __name__ == '__main__':
    main()
```
This is a Python implementation of the Java code provided. The main difference is that Python uses a different syntax for binary operations, such as `bin()` to convert a number to binary and `replace()` to replace characters in a string. Additionally, Python uses `int()` to convert a string to an integer, while Java uses `Long.parseLong()`.</s>
