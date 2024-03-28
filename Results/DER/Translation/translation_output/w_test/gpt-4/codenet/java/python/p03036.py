Here is the translated Python code:

```python
def solve(r, d, x):
    for i in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    r, d, x = map(int, input().split())
    solve(r, d, x)
```

You can run the provided test input as shown below:

```bash
$ echo "2 10 20" | python script.py
```

This should give you the expected output:

```
30
50
90
170
330
650
1290
2570
5130
10250
```

Please note that the Python version requires you to provide the input in a different way compared to Java. In the Java code, there's an InputReader class to read input from the console, but in this Python version, I'm simply using `input().split()` to read single line of space-separated inputs.
