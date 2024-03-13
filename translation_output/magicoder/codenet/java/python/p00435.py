<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

@@ Response
Here is the Python equivalent of the given Java code:

```python
import sys

def main():
    s = ""
    for c in input():
        s += chr((ord(c) - 42) % 26 + 65)
    print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, then for each character in the string, it subtracts 42 from the ASCII value of the character, takes the modulo 26 of the result, and adds 65 to the result. The result is then appended to the string `s`. Finally, it prints the string `s`.<｜end▁of▁sentence｜>
