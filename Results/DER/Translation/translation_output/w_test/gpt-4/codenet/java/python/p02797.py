Below is the translated code in Python:

```python
# Input: read from stdin
N, K, S = map(int, input().split())

# Output: write to stdout
if K == 0:
    if S == 1000000000:
        for i in range(N):
            print("1", end=" ")
    else:
        S += 1
        for i in range(N):
            print(S, end=" ")
else:
    for i in range(N):
        if i < K:
            print(S, end=" ")
        else:
            if S == 1000000000:
                print("1", end=" ")
            else:
                print(S + 1, end=" ")

# No explicit flushing is necessary as print automatically flushes the output by default in Python
```

This Python code should behave similarly to the Java code when given the same input. Note that Python's `print` function adds a space by default after each argument, so we use `end=" "` to maintain the same output formatting as the Java version's `PrintWriter`. Moreover, Python does not require explicit flushing or closing the output stream in this context.
