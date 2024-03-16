<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import sys
input = sys.stdin.readline

a, b, c, d = map(int, input().split())
print(max(max(max(a * c, b * d), a * d), b * c))
```
"""

import sys
input = sys.stdin.readline

a, b, c, d = map(int, input().split())
print(max(max(max(a * c, b * d), a * d), b * c))
<|endoftext|>
