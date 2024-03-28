Here is the equivalent code translated to Python:

```python
def main():
    nums = list(map(int, input().split()))
    max_val = max(nums)
    idx = nums.index(max_val)
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()
```

You can test the Python code with the provided test input:

Test input:
```
1000 900 850
```

Expected output:
```
A
```
