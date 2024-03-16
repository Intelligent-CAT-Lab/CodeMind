The provided Java code reads two integer inputs representing an era code (`e`) and a year (`y`), and outputs a formatted string indicating the year in the Japanese calendar system, or if the era code refers to a specific Japanese era, it calculates the corresponding Gregorian year.

Below is the equivalent Python code. Note that, for simplicity, I have omitted the `FastScanner` class from the translation as there's no direct equivalent in Python. Instead, Python's built-in input functionality is used.

```python
def solve(e, y):
    if e == 0:  # seireki
        if 1868 <= y <= 1911:  # meiji
            print("M" + str(y - 1867))
        elif 1912 <= y <= 1925:  # taishou
            print("T" + str(y - 1911))
        elif 1926 <= y <= 1988:  # shouwa
            print("S" + str(y - 1925))
        else:  # heisei
            print("H" + str(y - 1988))
    elif e == 1:  # meiji
        print(1867 + y)
    elif e == 2:  # taishou
        print(1911 + y)
    elif e == 3:  # shouwa
        print(1925 + y)
    elif e == 4:  # heisei
        print(1988 + y)

# Test input (could be replaced with e, y = map(int, input().split()) to read from standard input)
e, y = 0, 2015
solve(e, y)
```

This Python code directly maps the logic of the Java code. It takes `e` and `y` as arguments, determines which era the year `y` falls into based on the `e` value provided, and then prints out the resulting formatted string or calculated year. The example given in the code comment is how to gather input from the command line if you replace the fixed test inputs.

When you run the Python program with the sample test case input (`0 2015`), the output should be "H27", matching the expected output.
