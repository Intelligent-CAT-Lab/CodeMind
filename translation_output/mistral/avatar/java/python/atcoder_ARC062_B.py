<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

input = sys.stdin.readline().strip()
result = 0
p = 0
g = 1

for i in range(1, len(input)):
    if input[i] == 'g':
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
```</s>
