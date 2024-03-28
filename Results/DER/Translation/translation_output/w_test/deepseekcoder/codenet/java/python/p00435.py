<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JOI


```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### Response:
Here is the Python equivalent of the given Java code:

```python
s = input()
result = ""
for c in s:
    result += chr((ord(c) - 42) % 26 + 65)
print(result)
```

This Python code does the same thing as the Java code. It reads a string from the input, then iterates over each character in the string. For each character, it subtracts 42 from its ASCII value, takes the modulus of 26 (to ensure the result is within the range of uppercase letters), then adds 65 to get the ASCII value of the corresponding uppercase letter. The resulting character is then added to the result string. Finally, the result string is printed.
<|EOT|>
