Here is the translated Python code:

```python
def solve(a, b, c, x, y):
    min_cost = float('inf')
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_cost = min(min_cost, tmp)
    return min_cost

# Sample Test Case
input_str = "1500 2000 1600 3 2"
a, b, c, x, y = map(int, input_str.split())

print(solve(a, b, c, x, y))
```

Given the test input string `"1500 2000 1600 3 2"`, the expected output is `7900`. 

Please note that the Python code assumes the inputs are already provided as a string, similar to the behavior of the Scanner class in Java. If you want interactive input from the user, you can replace the `input_str` line with `input()` like so:

```python
a, b, c, x, y = map(int, input().split())
```

With this, the program will wait for the user to enter the values in the console.
