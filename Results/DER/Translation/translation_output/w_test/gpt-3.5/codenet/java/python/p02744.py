```python
def func(n):
    list = []
    if n == 1:
        list.append('a')
    else:
        prevList = func(n - 1)
        for s in prevList:
            max_char = 'a'
            for char in s:
                if max_char < char:
                    max_char = char
            for c in range(ord('a'), ord(max_char) + 2):
                new_string = s + chr(c)
                list.append(new_string)
    return list

n = int(input())
result = func(n)

for string in result:
    print(string)
```
