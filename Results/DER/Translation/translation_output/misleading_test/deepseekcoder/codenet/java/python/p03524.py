<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
#3S

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

### Response:
```python
def p03524(S):
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')

    if max(max(a,b),c)-min(min(a,b),c) <= 1:
        return "YES"
    else:
        return "NO"

print(p03524(input()))
```

This Python code does the same thing as the Java code. It counts the number of 'a', 'b', and 'c' in the input string and checks if the difference between the maximum and minimum counts is less than or equal to 1. If it is, it returns "YES"; otherwise, it returns "NO".
<|EOT|>
