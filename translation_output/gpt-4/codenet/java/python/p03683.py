Here's the equivalent Python code:

```python
def factorials_mod_billion(n, m):
    mod = 1_000_000_007
    result = 1
    for i in range(1, n + 1):
        result = (result * i) % mod
    for i in range(1, m + 1):
        result = (result * i) % mod
    return result

def main():
    line = input().split(" ")
    n = int(line[0])
    m = int(line[1])

    result = 0

    if abs(n - m) > 1:
        result = 0
    elif abs(n - m) == 1:
        result = factorials_mod_billion(n, m)
    else:
        result = factorials_mod_billion(n, m)
        result = (result * 2) % 1_000_000_007

    print(result)

if __name__ == "__main__":
    main()
``` 

This code segment translates the given Java code into Python, performing the same operations and preserving the logic of the original program.
