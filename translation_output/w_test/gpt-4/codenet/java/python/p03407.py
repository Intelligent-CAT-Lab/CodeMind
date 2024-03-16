Here's the equivalent Python code to the provided Java code:

```python
def two_coins_solve(a, b, c):
    return "Yes" if a + b >= c else "No"

if __name__ == "__main__":
    inputs = input().split()
    a, b, c = map(int, inputs)
    result = two_coins_solve(a, b, c)
    print(result)
```

Now, suppose you input `50 100 120` as in the test case, the expected output should be "Yes".
