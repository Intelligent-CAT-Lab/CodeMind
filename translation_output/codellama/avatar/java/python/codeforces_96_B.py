<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

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
This is the Python code equivalent to the Java code you provided. It uses the `bin()` function to convert the `mask` variable to a binary string, and then iterates over the characters in the string to count the number of zeros. If the number of zeros is not equal to the length of the string minus the number of zeros, it increments the `mask` variable and continues to the next iteration. Otherwise, it replaces the zeros with '4' and '7' and converts the string back to an integer using the `int()` function with a base of 2. Finally, it prints the resulting value.</s>
