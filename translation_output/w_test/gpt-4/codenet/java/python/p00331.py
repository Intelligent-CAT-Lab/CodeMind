Below is the equivalent Python code for the given Java code, utilizing a while loop to continuously accept input from the user. If Python's standard input/output is to be used, I'm using `sys.stdin` to emulate the scanner reading an unknown quantity of test cases which is more common for competitive programming problems. Otherwise, you could use `input()` which implicitly reads from `sys.stdin`. Please note that actual usage may require additional code to handle end-of-file conditions or input prompts.

```python
import sys

for line in sys.stdin:
    H, R = map(int, line.split())

    if H < 0 and abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)
```

When running this code, the Python script will expect input in the same format as described in the test case (-3 3). The script will produce the expected output (0) upon encountering this input. If you intend to run in an interactive mode or script where input should be terminated by user's decision then an `EOFError` should be caught for `input()`, or a specific condition must be used to break out of the infinite loop when working with `sys.stdin`.
