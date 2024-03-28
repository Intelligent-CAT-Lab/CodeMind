<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    number = int(sys.stdin.readline())
    mask = 2
    while True:
        s = bin(mask)[2:]
        zeros = s.count('0')
        if zeros!= s.count('1'):
            continue
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s, 2)
        if value >= number:
            break
        mask += 1
    print(value)

if __name__ == '__main__':
    main()
```
<|endoftext|>
