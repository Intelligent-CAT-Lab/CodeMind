<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
YES


```
import java.util.*;

public class p03524 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < S.length(); i++) {
      char x = S.charAt(i);
      if (x == 'a') a++;
      if (x == 'b') b++;
      if (x == 'c') c++;
    }
    if (Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c) <= 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

S = sys.stdin.readline().strip()
a = S.count('a')
b = S.count('b')
c = S.count('c')

if abs(a-b) <= 1 and abs(b-c) <= 1 and abs(a-c) <= 1:
    print('YES')
else:
    print('NO')
```
<|endoftext|>
