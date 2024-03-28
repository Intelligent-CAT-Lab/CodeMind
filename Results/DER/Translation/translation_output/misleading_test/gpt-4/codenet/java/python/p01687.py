Here is the translated code from Java to Python:

```python
def sort_substring(t):
    return sorted(t)

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = input()
        except EOFError:
            break

        if len(dstr) < 8:
            print(dstr)
            continue

        i = 0
        while i < len(dstr) - 7:
            t = dstr[i:i + 8]
            if ''.join(sort_substring(t)) == mstr:
                dstr = dstr[:i] + nstr + dstr[i + 8:]
                i += 7
            i += 1

        print(dstr)

if __name__ == "__main__":
    main()
```

This Python code uses a combination of string slicing and the `sorted()` function to achieve the same result as the Java code. The `sort_substring` function sorts the characters in a substring. The `main` function reads input until `EOF` (handled by `EOFError`, since unlike Java, Python doesn't have a straightforward way to check for `hasNext()` with standard input).

Usage for your test case: Provide the input (AIDUNYAN), and the code should output (AIUNYAN). 

Please note that Python does not require a separate function to sort the characters as it has a built-in `sorted` function. Additionally, the `input()` function is used to read from standard input in Python and I have used a try-except block to handle the end-of-file condition which would occur when input is terminated.
