<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JI

```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### Response:
Here is the Python code equivalent to the given Java code:

```python
s = input()
result = ""
for c in s:
    result += chr((ord(c) - 42) % 26 + 65)
print(result)
```

This Python code does the same thing as the Java code. It reads a string from the input, then iterates over each character in the string. For each character, it subtracts 42 from its ASCII value, takes the modulus of 26 to ensure the result is within the range of uppercase letters (A-Z), then adds 65 to bring the result back into the range of ASCII values for uppercase letters. The final result is a string of characters that are the same as the input string, but with each character shifted 2 positions to the left in the alphabet.
<|EOT|>
