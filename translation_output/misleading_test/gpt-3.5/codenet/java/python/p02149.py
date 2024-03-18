```python
def main():
    inputs = list(map(int, input().split()))
    max_val = 0
    idx = 0
    for i, val in enumerate(inputs):
        if max_val < val:
            max_val = val
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()
```
