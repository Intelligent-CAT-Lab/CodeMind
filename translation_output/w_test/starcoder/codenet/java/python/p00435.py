<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JOI


```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

python code:<fim_suffix><fim_middle>

```python
s = ''
for c in input():
    s += chr((ord(c) - 42) % 26 + 65)
print(s)
```
"""
<|endoftext|>
