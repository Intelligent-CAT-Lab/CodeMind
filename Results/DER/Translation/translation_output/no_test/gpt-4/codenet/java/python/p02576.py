Below is the translated version of the given Java code to Python:

```python
# In Python, we don't need to import a Scanner as we have built-in input() function
def p02576():
    n = int(input())  # Input for n
    x = int(input())  # Input for x
    t = int(input())  # Input for t
    ans = 0
    tako = 0
    while n > tako:
        ans += t
        tako += x
    print(ans)

# If you wish to run the function when the script is executed, uncomment the next line:
# p02576()
```

Note that Python uses dynamic typing, so there is no need to declare types for variables like `n, x, t, ans, and tako`. Function `p02576()` encapsulates the functionality of the Java class' main method. To execute the function, you would call `p02576()`.

For ease of use, `input()` will get the whole line of input, and you would convert the input to an integer with `int()` since `input()` returns string data. Unlike Java, Python uses indentation to define code blocks instead of braces `{}`.

If you want to read the inputs on a single line, you could modify the input lines accordingly to:

```python
n, x, t = [int(i) for i in input().split()]
```

Make sure to call the `p02576` function (remove the `#` from the last line) when you are ready to run the program.
