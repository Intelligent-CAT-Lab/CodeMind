

```python

def func(n):
    if n == 1:
        return ['a']
    else:
        prevList = func(n - 1)
        list = []
        for s in prevList:
            max = 'a'
            for i in range(len(s)):
                if max < s[i]:
                    max = s[i]
            for c in range(ord('a'), ord(max) + 2):
                newString = s + chr(c)
                list.append(newString)
        return list

n = int(input())
list = func(n)
for s in list:
    print(s)

```
/p02744.py
def func(n):
    if n == 1:
        return ['a']
    else:
        prevList = func(n - 1)
        list = []
        for s in prevList:
            max = 'a'
            for i in range(len(s)):
                if max < s[i]:
                    max = s[i]
            for c in range(ord('a'), ord(max) + 2):
                newString = s + chr(c)
                list.append(newString)
        return list

n = int(input())
list = func(n)
for s in list:
    print(s)

