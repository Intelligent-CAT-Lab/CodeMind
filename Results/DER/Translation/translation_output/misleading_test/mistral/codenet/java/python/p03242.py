<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
119

Expected output:
978

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
S = input()
for i in range(3):
    if S[i] == '1':
        S[i] = '9'
    else:
        S[i] = '1'
print(S)
```</s>
