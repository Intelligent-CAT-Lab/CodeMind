Below is the translated Python code from the given Java code snippet:

```python
def atcoder_ABC125_A():
    a = int(input())
    b = int(input())
    n = int(input())
    k = 0
    for i in range(1, n // a + 1):
        k += b
    print(k)

atcoder_ABC125_A()
```

This Python function performs the same operations as the Java code. It reads three integer values from the user input, performs the loop calculations and prints the result. Remember that the Python `range` function already iterates from the start value up to but not including the stop value, which is why `n // a + 1` is used as the stop value to replicate the Java for loop's condition.
