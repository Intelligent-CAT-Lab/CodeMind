<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

S = sys.stdin.readline()
a, b, c = 0, 0, 0
for i in range(len(S)):
    x = S[i]
    if x == 'a':
        a += 1
    elif x == 'b':
        b += 1
    elif x == 'c':
        c += 1
if abs(max(max(a,b),c) - min(min(a,b),c)) <= 1:
    print("YES")
else:
    print("NO")
```</s>
