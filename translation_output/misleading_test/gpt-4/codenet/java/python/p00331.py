Here is the translated code from Java to Python:

```python
while True:
    try:
        H, R = map(int, input().split())
        
        if H < 0 and abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)
    except EOFError:
        break
```

When you run this Python code and input `-3 3` as a test case, the expected output will be `-25`. However, the last conditional branch in the Java code will not print `-25` but `-1` for this input; the Python code reflects the logic presented in the original Java code. If your expected output (`-25`) is correct for your specific problem, then there might be an error in the Java code or in specifying the expected output.
