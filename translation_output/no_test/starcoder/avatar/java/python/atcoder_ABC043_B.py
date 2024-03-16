<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import re

s = input()

while re.search(r'0B | 1B ', s):
    s = re.sub(r'0B | 1B ', '', s)

s = re.sub(r' B ', '', s)

print(s)
```
"""

import re

s = input()

while re.search(r'0B | 1B ', s):
    s = re.sub(r'0B | 1B ', '', s)

s = re.sub(r' B ', '', s)

print(s)
<|endoftext|>
