<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
def p03242(S):
    S = list(str(S))
    for i in range(3):
        S[i] = '9' if S[i] == '1' else '1'
    return "".join(S)

print(p03242(119))
```

This Python function takes an integer as input, converts it to a string, and then converts that string to a list of characters. It then iterates over the first three characters of the list, replacing '1' with '9' and '9' with '1'. Finally, it joins the list of characters back into a string and returns it.
<|EOT|>
