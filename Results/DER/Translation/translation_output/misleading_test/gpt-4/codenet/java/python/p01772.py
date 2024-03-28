Below is the Python version of the provided Java code:

```python
class p01772:
    def run(self):
        # Simulate MyScanner with Python input (assuming one line input)
        c = input().strip()
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = s
        n = len(c)
        s = []
        for i in range(n):
            if len(s) == 0 or s[-1] != c[i]:
                s.append(c[i])
        if len(s) > 0 and s[0] == 'Z':
            s.pop(0)
        if len(s) > 0 and s[-1] == 'A':
            s.pop()
        if len(s) > 0:
            print(''.join(s))
        else:
            print(-1)

if __name__ == '__main__':
    p = p01772()
    p.run()
```

To test the code, you can run the following Python snippet:

```python
p = p01772()
p.run()
```
When prompted, enter `AIZUNYANPEROPERO`, and the output should be `,AZ`. Note that the input in Python is expected as a standard input, not through a `MyScanner` class as in Java, so the equivalent has been adapted to use the `input()` function. Also, the StringBuilder pattern in Java is replaced by using Python lists and the `join()` method to concatenate characters into strings efficiently.
