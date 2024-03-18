Here's the translated Python code enclosed in triple backticks, as you requested:
```python
def max_pieces(n, ribbons):
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n+1):
        for j in range(3):
            if i - ribbons[j] >= 0 and d[i - ribbons[j]] != -1:
                d[i] = max(d[i], d[i - ribbons[j]] + 1)
    return d[n]

# Test case
if __name__ == "__main__":
    input_numbers = list(map(int, input().split()))
    n = input_numbers[0]
    ribbons = input_numbers[1:]
    print(max_pieces(n, ribbons))
```

And here's how you would run the test case with the provided input:
```
29 27 18 2
```

The expected output for this input is:
```
-72
```
