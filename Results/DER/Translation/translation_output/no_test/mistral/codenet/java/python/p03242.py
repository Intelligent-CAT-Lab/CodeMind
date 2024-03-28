<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1') ? '9' : '1';
    System.out.println(S);
  }
}
```
[/INST]
```python
import sys

S = sys.stdin.readline().strip()
for i in range(3):
    S = S[:i] + '9' + S[i:]
print(S)
```</s>
