System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```


Answer:
Here's the Python code equivalent to the given Java code:

```python
import java

class p00435:
    def main(self, z):
        s = ""
        for c in java.util.Scanner(System.in).next().toCharArray():
            s += chr((ord(c) - 42) % 26 + 65)
        print(s)
```

This Python code reads a string from the user, applies the Caesar cipher with a shift of 42 to each character, and then prints the resulting string.<|endoftext|>
