Here is the translated Python code from the above Java code:

```python
# No import is required for input and output in Python

N = int(input())
K = int(input())
S = int(input())

if K == 0:
    if S == 1000000000:
        for i in range(N):
            print("1 ", end='')
    else:
        S += 1
        for i in range(N):
            print(str(S) + " ", end='')
else:
    for i in range(N):
        if i < K:
            print(str(S) + " ", end='')
        else:
            if S == 1000000000:
                print("1 ", end='')
            else:
                print(str(S + 1) + " ", end='')

# No need to close Scanner or flush PrintWriter in Python
```

In Python, the `print` function automatically appends a space between arguments when separated by commas, `end=''` is used to avoid the default newline after each print. At the same time, `input()` is used to read user input, which reads everything as a string, so `int()` is necessary to convert to integer. There is no need to handle resources like `Scanner` and `PrintWriter` as in Java, so they are not included in the equivalent Python code.
