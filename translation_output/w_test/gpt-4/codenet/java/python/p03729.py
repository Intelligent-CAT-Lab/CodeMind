Here's the Java code translated into Python with the same functionality. The Python code reads three strings from the user input and checks if the last character of the first string matches the first character of the second string, and if the last character of the second string matches the first character of the third string. It then prints `"YES"` or `"NO"` based on this condition.

```python
# Read the strings from user input
a = input()
b = input()
c = input()

# Check the last character of `a` with the first character of `b`
# and the last character of `b` with the first character of `c`
if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")
```

To use the sample test input ("rng gorilla apple"), you can either input the values one by one when prompted or modify the code to take a single line of input and split it into individual words. Here is an example of how to do this:

```python
# Read the strings from user input in a single line
a, b, c = input().split()

# Check the last character of `a` with the first character of `b`
# and the last character of `b` with the first character of `c`
if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")
```

When you run this version of the code, you can input "rng gorilla apple" on a single line, and the expected output will be "YES".
