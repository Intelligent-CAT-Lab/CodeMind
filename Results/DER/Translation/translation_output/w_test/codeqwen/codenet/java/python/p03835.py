Here is the Python equivalent of the Java code:

```python
def main():
    # input
    k = int(input())
    s = int(input())

    # search
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if z >= 0 and z <= k:
                count += 1

    # answer
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, then it searches for all possible combinations of x, y, and z such that x + y + z = s and x, y, and z are all non-negative and less than or equal to k. It counts the number of such combinations and prints the result.
