<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```
[/INST]
```python
class p00435:
    def main(self):
        s = ""
        for c in input():
            s += chr(((ord(c) - 42) % 26) + 65)
        print(s)
```</s>
