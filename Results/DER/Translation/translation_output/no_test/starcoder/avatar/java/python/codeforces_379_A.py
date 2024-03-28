<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a / b);
            a = (a / b) + (a % b);
        }
        
        System.out.println(res);
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
res = a

while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

print(res)
```
"""
<|endoftext|>
