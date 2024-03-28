Here's the equivalent code in Python:

```python
def main():
    n = int(input())
    arr = [False] * (n + 3)
    arr[0], arr[1] = True, True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, len(arr) // i + 1):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    print(count * 2)

if __name__ == "__main__":
    main()
```

Test this code with the provided input to get the expected output:

Test input:
```
3
```

Expected output:
```
2
```
