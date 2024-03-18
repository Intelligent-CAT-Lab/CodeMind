Here's the translated Python code that provides equivalent functionality to the provided Java code:

```python
def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = get_length(n - 1)
    p = get_p(n - 1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)
    
    return sum

def get_length(n):
    return 1 + 4 * (2 ** n - 1)

def get_p(n):
    return 1 + 2 * (2 ** n - 1)

if __name__ == "__main__":
    n, x = map(int, input().split())
    print(calc(n, x))
```

To test this Python script with the test input `2 7`, you would simply run the script and input the test case when prompted.
