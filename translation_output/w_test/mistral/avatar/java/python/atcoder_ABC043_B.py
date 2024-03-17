<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
0000000000


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
[/INST]
```python
import re

s = input()

while '0B ' in s or '1B ' in s:
    s = re.sub('0B ', '', s)
    s = re.sub('1B ', '', s)

s = re.sub(' B ', '', s)

print(s)
```</s>
