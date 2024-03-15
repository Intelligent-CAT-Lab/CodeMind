Below is the translated Python code for the provided Java code:

```python
import sys

def main():
    str = sys.stdin.readline().rstrip()  # Assuming the input is provided in a similar way as in Java code
    n = len(str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if str[ptr] == '>':
            while ptr < n and str[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += curr + ((cnt * (cnt - 1)) // 2)
            else:
                sum += ((cnt + 1) * cnt) // 2
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if str[n - 1] == '<':
        sum += curr
    print(sum)

if __name__ == "__main__":
    main()
```

A few things to note:
1. In Python, we don't need to specify classes or static methods, so we can just define a main function.
2. The `BufferedReader` and `PrintWriter` in Java has been replaced with `sys.stdin.readline()` and `print()` in Python.
3. The `/ 2` division in Java, which is integer division, has been replaced with `// 2` in Python to ensure integer division.
4. The `out.close()` call is not needed in Python because we're not opening any files explicitly.
5. In Python, strings are 0-indexed and can be accessed via brackets (e.g., `str[ptr]`).
6. It is assumed that user input handling is similar to Java's; otherwise, the input handling might need to be adapted.
7. Python code doesn't require semicolons to terminate statements.
