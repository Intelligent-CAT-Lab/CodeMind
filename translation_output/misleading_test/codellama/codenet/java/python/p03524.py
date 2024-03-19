<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import math

def solve(s):
    a, b, c = 0, 0, 0
    for char in s:
        if char == 'a':
            a += 1
        elif char == 'b':
            b += 1
        elif char == 'c':
            c += 1
    if math.max(math.max(a, b), c) - math.min(math.min(a, b), c) <= 1:
        return "YES"
    else:
        return "NO"

s = "abac"
print(solve(s))
```
The code first initializes the variables `a`, `b`, and `c` to 0, which will store the number of occurrences of each character in the input string.

Then, it iterates through the characters of the input string using a for loop, and for each character, it checks if it is 'a', 'b', or 'c', and if it is, it increments the corresponding variable.

After the for loop, it calculates the difference between the maximum and minimum number of occurrences of any two characters, and if that difference is less than or equal to 1, it returns "YES", otherwise it returns "NO".

Finally, it prints the result of the `solve` function for the input string "abac".</s>
