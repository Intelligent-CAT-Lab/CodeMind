<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
119

Expected output:
991


```
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1')? '9' : '1';
    System.out.println(S);
  }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

S = sys.stdin.readline().strip()
for i in range(3):
    if S[i] == '1':
        S = S[:i] + '9' + S[i+1:]
print(S)
```
<|endoftext|>
