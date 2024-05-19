System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
            
            if (zeros!= s.length() - zeros) {
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


Answer:
```python
import sys

def lucky_number(number):
    mask = 2
    value = -1
    
    while value < number:
        s = bin(mask)[2:]
        zeros = s.count('0')
        
        if zeros!= len(s) - zeros:
            mask += 1
            continue
        
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s)
        mask += 1
    
    return value

if __name__ == "__main__":
    number = int(sys.stdin.readline())
    print(lucky_number(number))
```<|endoftext|>
