Here's the python equivalent of your Java code:

```python
# Python equivalent code
try:
    # Taking input from the user and splitting the input on space
    A, P = map(int, input().split())
    # Calculating and printing the result
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception:", e)
```

Please note that in Python, the line `A, P = map(int, input().split())` reads a line from input, splits it by spaces, and then maps each part to an integer, effectively parsing them similar to how it is done with `Integer.parseInt` in Java. Additionally, the `//` operator in Python performs integer division, like `/` in Java, which will truncate the result to an integer if needed.
