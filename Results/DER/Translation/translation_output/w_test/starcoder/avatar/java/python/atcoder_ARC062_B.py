<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

input = sys.stdin.readline().strip()

p = 0
g = 1
result = 0

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
```

'''
<|endoftext|>
