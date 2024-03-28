<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1') ? '9' : '1';
    System.out.println(S);
  }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

S = sys.stdin.readline().strip()
for i in range(3):
    if S[i] == '1':
        S[i] = '9'
    else:
        S[i] = '1'
print(S)
```
This code reads a line of input from the user, converts it to a list of characters, and then iterates over the list and replaces each character with '9' if it is '1', and with '1' if it is '9'. Finally, it prints the resulting list of characters.

Note that in Python, we use `sys.stdin.readline()` to read a line of input from the user, and `strip()` to remove any trailing newline characters. We also use `range(3)` to iterate over the first three elements of the list, rather than using a for loop with a hard-coded index.</s>
