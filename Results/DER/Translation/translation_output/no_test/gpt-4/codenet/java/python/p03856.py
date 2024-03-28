Below is the Python translation of the provided Java code. Note that in Python, we don't need to explicitly create BufferedReader or PrintWriter as file I/O is handled differently. Additionally, Python's syntax is quite different, and we don't need to manually tokenize the inputs:

```python
import sys

def main():
    # Since Python handles file I/O differently, we can read directly from stdin
    # Not translating the part of code dealing with "input.txt" and "output.txt"
    qq = sys.maxsize
    # qq = int(read_token()) # Uncomment this and comment above line if you want to read qq

    for casenum in range(1, qq + 1):
        s = read_line()
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [False] * (len(s) + 1)
        poss[0] = True
        for i in range(len(s)):
            if not poss[i]:
                continue
            for out in good:
                if i + len(out) > len(s):
                    continue
                match = sum(1 for a in range(len(out)) if out[a] == s[i+a])
                if match == len(out):
                    poss[i+match] = True
        print("YES" if poss[len(s)] else "NO")

def exit_immediately():
    sys.exit(0)

def read_long():
    return int(read_token())

def read_double():
    return float(read_token())

def read_int():
    return int(read_token())

def read_line():
    s = sys.stdin.readline()
    if s == '':
        exit_immediately()
    return s.strip()

def read_token():
    global buffer
    if not buffer:
        buffer = sys.stdin.readline().strip().split()
    while not buffer:
        line = sys.stdin.readline().strip()
        if line == '':
            exit_immediately()
        buffer = line.split()
    return buffer.pop(0)

if __name__ == '__main__':
    buffer = []
    main()
```

Some important notes about the translation:
- In Python, it's common to read lines directly from `sys.stdin`, and there's no need for a special method to read different types of data as you can directly convert the string to int, float, etc.
- The global `buffer` variable is used to mimic the behavior of `StringTokenizer` from Java.
- Python's `sum` function with a generator expression is used to count the matches in the strings.
- We use `sys.maxsize` as an equivalent for `Integer.MAX_VALUE` in Python.
- The script is intended to be run in an environment where the standard input (stdin) is provided; otherwise, the `read_line()` function will hang waiting for input. In an actual implementation, you might want to handle user input or file input differently.
