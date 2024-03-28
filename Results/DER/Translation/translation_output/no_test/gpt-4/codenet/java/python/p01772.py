Below is the translated Python code. Note that in Python, there is no need to import anything for simple input/output operations, nor is there a need to explicitly convert strings to character arrays, 
as strings can be indexed and iterated over directly. Additionally, Python has dynamic typing, so there's no need for explicit data type declarations for variables.

The `MyScanner` class from the Java code is replaced with Python's built-in `input()` function for reading strings, and `int(input())` for reading integers.

```python
class p01772:
    def run(self):
        c = input()
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = s
        n = len(c)
        s = []
        for i in range(n):
            if len(s) == 0 or s[-1] != c[i]:
                s.append(c[i])
        if len(s) > 0 and s[0] == 'Z':
            s.pop(0)
        if len(s) > 0 and s[-1] == 'A':
            s.pop()
        if len(s) > 0:
            print(''.join(s))
        else:
            print(-1)

    def map_debug(self, a):
        print("--------map display---------")
        for row in a:
            for val in row:
                print(f"{val:3d} ", end='')
            print()
        print("----------------------------\n")


if __name__ == "__main__":
    obj = p01772()
    obj.run()
```

Please note that this Python code assumes we're taking standard line input instead of character-by-character input, and `map_debug()` is simply used to print a 2D array in a formatted manner, so it's okay to use `print` statements. Input error handling is also omitted, assuming the user will always provide the correct input. This is because handling input errors in Python typically doesn't involve catching exceptions manually as was done in the Java version with `InputMismatchException`. Instead, Python programs often use try-except blocks or input validation techniques.

Also, note that the `MyScanner` class has several methods that aren't directly used in the provided Java method `run()`. I've not translated those methods as they serve no purpose in the context of this specific `run()` conversion. If they're necessary, we can utilize Python's built-in functions like `str.split()` for splitting strings into arrays, and list comprehensions for creating lists from input data.
