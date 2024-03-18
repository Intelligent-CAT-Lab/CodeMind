Certainly! Below is the Python equivalent of the provided Java code:

```python
while True:
    try:
        line = input()
        if not line:
            break
        c1 = c2 = c3 = 0
        if len(line) < 6:
            print("INVALID")
        else:
            for c in line:
                if '0' <= c <= '9':
                    c1 += 1
                elif 'A' <= c <= 'Z':
                    c2 += 1
                else:
                    c3 += 1
            if c1 > 0 and c2 > 0 and c3 > 0:
                print("VALID")
            else:
                print("INVALID")
    except EOFError:
        break
```

This code will read lines from standard input until an EOF (End-of-File) is reached, which simulates the behavior you would expect from the Java BufferedReader in a console application. Note that since Python's `input()` function automatically reads a line from standard input, there's no need to explicitly use a BufferedReader as in Java.

Here is how the Python code works:

1. It enters into an infinite loop that will only terminate when an `EOFError` is encountered (simulating the end of input).
2. It reads a line from standard input using `input()`.
3. If the line is empty (which should only happen if you explicitly provide an empty line), it breaks the loop.
4. It initializes counters (`c1`, `c2`, `c3`) for digits, uppercase letters, and others, respectively.
5. If the line length is less than 6 characters, it prints `"INVALID"`.
6. Otherwise, it iterates over each character in the line, updating the counters as required.
7. After the loop, it checks if all three types of characters are present; if so, prints `"VALID"`, otherwise, prints `"INVALID"`.
8. If `EOFError` occurs, it signifies the end of input, and the loop terminates.
