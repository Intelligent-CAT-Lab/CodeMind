Here is the Python equivalent of the Java code:

```python
K = int(input())
X = int(input())

for i in range(X - K + 1, X + K):
    print(i, end=" ")
print(X + K)
```

This Python code does the same thing as the Java code. It reads two integers from the user, K and X, and then prints out a sequence of integers from X - K + 1 to X + K - 1, inclusive. The `end=" "` argument in the `print` function is used to print the numbers on the same line separated by spaces instead of on separate lines. After the loop, the final number X + K is printed on a new line.
