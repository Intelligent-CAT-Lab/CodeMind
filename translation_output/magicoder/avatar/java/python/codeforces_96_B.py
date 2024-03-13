<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
def main():
    number = int(input())
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

    print(value)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a number from the user, then it generates binary representations of numbers starting from 2, checks if the number of zeros and ones are equal, and if they are, it replaces the zeros with 4s and the ones with 7s. It then converts the binary string to an integer and checks if it's less than the input number. If it is, it continues to the next number. If it's not, it prints the number.<｜end▁of▁sentence｜>
