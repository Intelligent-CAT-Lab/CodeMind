Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YE#S

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

### Response:
```python
import re

def is_valid(s):
    pattern = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    return re.match(pattern, s)

s = input()
if is_valid(s):
    print("YES")
else:
    print("NO")
```<|endoftext|>
