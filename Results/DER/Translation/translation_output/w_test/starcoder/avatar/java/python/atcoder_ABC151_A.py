<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
c

Expected output:
d


```
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
s = input()
print(chr(ord(s[0]) + 1))
```
"""

s = input()
print(chr(ord(s[0]) + 1))
<|endoftext|>
