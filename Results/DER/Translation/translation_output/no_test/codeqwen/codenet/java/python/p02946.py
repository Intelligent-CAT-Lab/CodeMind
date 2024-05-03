Here is the Python equivalent of the Java code:

```python
K = int(input())
X = int(input())

for i in range(X - K + 1, X + K):
    if i != X + K - 1:
        print(i, end=" ")
    else:
        print(i)
```

In Python, we use the `input()` function to get user input, and `int()` to convert the input to an integer. The `range()` function is used to generate a sequence of numbers, similar to the `for` loop in Java. The `end=" "` argument in the `print()` function is used to print the numbers on the same line separated by a space instead of a newline.
