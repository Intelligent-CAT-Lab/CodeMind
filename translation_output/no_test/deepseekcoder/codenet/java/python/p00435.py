<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### Response:
```python
import string

def main():
    s = ""
    for c in input():
        s += chr((ord(c) - 42) % 26 + 65)
    print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. For each character, it subtracts 42 from the ASCII value of the character (using the `ord` function), then takes the modulus of the result with 26. This effectively wraps the value around to the beginning of the alphabet if it goes past 'Z'. Finally, it adds 65 to the result to shift the value back into the ASCII range for uppercase letters, and converts it back to a character using the `chr` function. The resulting string is then printed to the console.
<|EOT|>
