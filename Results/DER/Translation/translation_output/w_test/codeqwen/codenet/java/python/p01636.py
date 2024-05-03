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

This Python code does the same thing as the Java code. It reads a string input, then iterates over each possible substring of the input. For each substring, it checks if the substring can be converted to an integer, and if it can, it converts it. If the substring is empty, it assigns 0 to the corresponding variable. If the substring starts with a '-', it skips that substring. If the substring cannot be converted to an integer, it skips that substring. If the sum of the two integers is odd, it skips that substring. If the difference of the two integers is odd, it skips that substring. If none of these conditions are met, it increments the answer. Finally, it prints the answer.
