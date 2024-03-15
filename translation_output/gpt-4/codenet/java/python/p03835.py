Below is the equivalent Python code translated from the provided Java code:

```python
def main():
    # input
    k = int(input())
    s = int(input())

    # search
    count = 0
    for x in range(k + 1):
        for y in range(k + 1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1

    # answer
    print(count)

if __name__ == "__main__":
    main()
```

In this Python version, we use the `input()` function to read integers from the standard input, and we iterate through the ranges using `range(k + 1)` to include the upper bound `k`. The `print` function is used to output the final count. Python does not require importing a scanner utility as in Java, and the syntax for getting user input and iterating over ranges is more concise.
