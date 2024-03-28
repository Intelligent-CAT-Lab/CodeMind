Here is the translated code from Java to Python:

```python
s = input()

answer = ""

for i in range(len(s), 1, -2):
    ss = s[:i]
    
    s1 = ss[:len(ss)//2]
    s2 = ss[len(ss)//2:]
    
    if s1 == s2 and len(ss) != len(s):
        answer = ss
        break

print(len(answer))
```
