Here's the Java code translated to Python, including the custom sort functionality and console input handling:

```python
def custom_sort(t):
    return sorted(t)

def replace_substring(dstr, mstr, nstr):
    for i in range(len(dstr) - 7):
        t = list(dstr[i:i+8])
        tt = ''.join(t)
        if ''.join(custom_sort(t)) == mstr:
            dstr = dstr.replace(tt, nstr, 1)
            i += 7
    return dstr

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = input().strip()
        except EOFError:  # to handle the end of input
            break  
        if len(dstr) < 8:
            print(dstr)
            continue
        print(replace_substring(dstr, mstr, nstr))

# Run the program
if __name__ == "__main__":
    main()
```

For the test input:

```plaintext
AIDUNYAN
```

With this Python script, the expected output should be:

```plaintext
AIZUNYAN
```

Run the code in an environment that reads from the console (standard input). Since you provided a specific test input, you could also modify the `main` function to use predefined inputs instead of `input()` for testing purposes.
