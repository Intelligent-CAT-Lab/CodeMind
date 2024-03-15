<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

a = int(input())
b = int(input())
res = a

while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

print(res)
```</s>
