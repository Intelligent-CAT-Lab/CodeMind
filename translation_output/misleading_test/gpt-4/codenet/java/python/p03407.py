Here is the Python translation of the provided Java code:

```python
def two_coins(a, b, c):
    return "Yes" if a + b >= c else "No"

if __name__ == "__main__":
    a, b, c = map(int, input().split())
    result = two_coins(a, b, c)
    # Replace "Yes" with "Ye7s"
    result = result.replace("Yes", "Ye7s")
    print(result)
```

When provided with the input `50 100 120`, this Python code will produce the expected output `Ye7s`.
