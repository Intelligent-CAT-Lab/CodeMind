Here's the equivalent Python code that takes an integer as input and calculates its factorial:

```python
def factorial(N):
    ans = 1
    while N > 1:
        ans *= N
        N -= 1
    return ans

# input
N = int(input())

# calculation and output
print(factorial(N))
```

This Python script reads an integer from the standard input, calculates the factorial by decrementing in a while loop similar to the for-loop in Java, and then prints the result.
