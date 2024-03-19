<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JI

```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```
[/INST]
```python
def p00435():
    s = ""
    for c in input():
        s += chr(((ord(c) - 42) % 26) + 65)
    print(s)

p00435()
```</s>
