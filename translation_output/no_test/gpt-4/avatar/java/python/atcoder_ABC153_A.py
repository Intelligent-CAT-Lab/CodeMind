Here's how you can translate the given Java code into Python:

```python
def atcoder_ABC153_A():
    monsterHP = int(input())
    servalATK = int(input())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

atcoder_ABC153_A()
```

This Python code reads two integer values just like the Java code and calculates the required number of attacks to defeat the monster. Note that in Python, `input()` is used to read strings from the standard input, so we have to convert them into integers using `int()`. Also, the integer division operator in Python is `//` instead of `/` which is used in Java to avoid floating point results.
