```python
def main():
    numbers = list(map(int, input().split()))
    max_num = max(numbers)
    max_idx = numbers.index(max_num)
    print(chr(ord('A') + max_idx))

if __name__ == "__main__":
    main()
```
