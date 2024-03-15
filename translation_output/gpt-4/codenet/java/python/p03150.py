Below is the translated code from Java to Python:

```python
def main():
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")

def check(s):
    if s == "keyence":
        return True
    else:
        for i in range(len(s)):
            for j in range(i + 1, len(s) + 1):
                str = s[:i] + s[j:]
                if str == "keyence":
                    return True
    return False

if __name__ == "__main__":
    main()
```

Please note that in Python, slicing is used to get a substring, and there is no need to import a Scanner class for input as `input()` is used for reading from stdin. Additionally, the main function has been included for clarity and consistency with the Java code structure, but Python does not require a main function by default for scripts to run.
