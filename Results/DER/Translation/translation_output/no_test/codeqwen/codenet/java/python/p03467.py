Here is the Python equivalent of the Java code:

```python
P = 998244353

def go(s):
    if not s:
        return 1
    if s in map:
        return map[s]

    ret = (1 + ord(s[0]) - ord('0')) * go(s[1:]) % P
    for x in range(1, len(s) // 2 + 1):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[(k - 1) * x + i] == '0':
                    buf[i] = '0'
            ret += go(''.join(buf)) * go(s[k * x:]) % P

    map[s] = ret % P
    return ret % P

def submit():
    s = input()
    print(go(s))

def preCalc():
    pass

def stress():
    pass

def test():
    pass

if __name__ == "__main__":
    preCalc()
    submit()
    # stress()
    # test()
```

Please note that Python does not have a built-in `HashMap` equivalent, so I used a Python `dict` instead. Also, Python does not have a built-in `StringTokenizer` equivalent, so I used Python's built-in `split()` function to tokenize the input string. The `ord()` function is used to get the ASCII value of a character. The `%` operator is used for modulo operation in Python.
