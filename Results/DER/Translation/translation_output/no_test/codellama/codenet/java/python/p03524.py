<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

S = sys.stdin.readline().strip()
a, b, c = 0, 0, 0
for x in S:
    if x == 'a':
        a += 1
    elif x == 'b':
        b += 1
    elif x == 'c':
        c += 1

if max(max(a, b), c) - min(min(a, b), c) <= 1:
    print("YES")
else:
    print("NO")
```
Note: The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The `for` loop iterates over the characters in the input string, and the `if` statement checks if the character is equal to 'a', 'b', or 'c', and increments the corresponding variable accordingly. The `max()` and `min()` functions are used to find the maximum and minimum values of the variables, and the difference between them is checked to determine if the condition is met. Finally, the output is printed to the standard output stream.</s>
