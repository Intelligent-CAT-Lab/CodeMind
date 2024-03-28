Here is the Java code translated to Python:

```python
def p02439():
    a, b, c = map(int, input().split())
    minimum = min(a, b)
    maximum = max(a, b)
    print(min(minimum, c), max(maximum, c))

# Sample Test Case
p02439()
```

You can run this function in a Python environment. It expects an input in the format similar to the test input provided ("4 5 3") and will print out the result just like the expected output ("3 5"). Note that the actual implementation of receiving input from the user may differ based on how you choose to run the script (terminal, IDE, web-based interpreter, etc.). If you want to strictly mimic the Java behavior in a standalone Python script, you would remove the function definition and call, and just write the body of the function as part of the main script.
