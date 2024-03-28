<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import re

pat = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
s = input()
if re.match(pat, s):
    print("YES")
else:
    print("NO")
```
"""
<|endoftext|>
