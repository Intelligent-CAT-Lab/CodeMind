Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### Response:
```python
class p00435:
    def main(self, z):
        s = ""
        for c in java.util.Scanner(System.in).next().toCharArray():
            s += chr((ord(c) - 42) % 26 + 65)
        print(s)
```<|endoftext|>
