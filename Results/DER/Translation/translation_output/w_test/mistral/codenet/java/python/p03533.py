<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
import java.util.*;

public class p03533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}

```
[/INST]
```python
import re

def check(s):
    pattern = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    if re.search(pattern, s):
        return "YES"
    else:
        return "NO"

s = input()
print(check(s))
```</s>
