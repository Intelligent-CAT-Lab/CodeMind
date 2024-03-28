<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JI

```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

@@ Response
Here is the Python equivalent of the given Java code:

```python
s = input()
result = ""
for c in s:
    result += chr((ord(c) - 42) % 26 + 65)
print(result)
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. For each character, it subtracts 42 from its ASCII value, takes the modulus of 26 (to ensure the result is within the range of uppercase letters in ASCII), and then adds 65 to get the ASCII value of the corresponding uppercase letter. The resulting uppercase letter is then added to the result string. Finally, it prints the result string.<｜end▁of▁sentence｜>
