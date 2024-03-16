<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;
import java.util.ArrayList;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

n = int(input())
s = ""

while n > 0:
    x = n % 2
    n //= 2
    s += str(x) + " "

ans = 0

for i in range(len(s)):
    if s[i] == "1":
        ans += 1

print(ans)
```
This is the Python code equivalent to the given Java code. The `input()` function is used to read a line of input from the user, and the `int()` function is used to convert the input to an integer. The `while` loop is used to iterate over the digits of the input number, and the `//=` operator is used to perform integer division and assignment. The `str()` function is used to convert the integer to a string, and the `+=` operator is used to concatenate the string with the previous value of `s`. The `for` loop is used to iterate over the characters of the string `s`, and the `if` statement is used to check if the character is equal to `'1'`. If it is, the `ans` variable is incremented. Finally, the `print()` function is used to output the value of `ans`.</s>
