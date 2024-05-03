Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, int(len(arr) / i) + 1):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    print(count * 2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It first reads an integer from the user, then creates a boolean array of size `n + 3` and initializes the first two elements to `True`. It then iterates over the array, and for each unmarked element, it marks all its multiples. If an element and its predecessor are both unmarked, it increments the count. Finally, it prints the count multiplied by `2`.
