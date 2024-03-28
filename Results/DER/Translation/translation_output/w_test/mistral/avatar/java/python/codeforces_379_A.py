<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
80 970

Expected output:
80


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
a, b = map(int, input().split())
res = a

while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

print(res)
```</s>
