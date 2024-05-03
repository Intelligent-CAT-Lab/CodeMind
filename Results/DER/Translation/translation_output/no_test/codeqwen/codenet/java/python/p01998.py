Here is the Python equivalent of your Java code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
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

This Python code does the same thing as your Java code. It reads an integer from the standard input, creates a boolean array of size `n + 3`, and then iterates over the array. If the current index is not marked as prime, it marks all multiples of that index as non-prime. If the current index is not marked as prime and the previous index is also not marked as prime, it increments the count. Finally, it prints the count multiplied by 2.
