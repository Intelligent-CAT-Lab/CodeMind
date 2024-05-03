Here is the Python equivalent of the Java code:

```python
def run():
    a = input()
    ans = 0
    for i in range(len(a)):
        head = a[:i]
        tail = a[i:]
        h, t = 0, 0
        if head:
            h = int(head)
        if tail:
            t = int(tail)
        if t < 0:
            continue
        if h > t:
            continue
        if (h + t) % 2 != 0:
            continue
        if (t - h) % 2 != 0:
            continue
        ans += 1
    print(ans)

run()
```

This Python code does the same thing as the Java code. It reads an input string, then iterates over all possible substrings of the string. For each substring, it checks if the substring can be converted to an integer, and if it can, it checks if the integer is valid according to the conditions specified in the Java code. If the integer is valid, it increments the answer. Finally, it prints the answer.
