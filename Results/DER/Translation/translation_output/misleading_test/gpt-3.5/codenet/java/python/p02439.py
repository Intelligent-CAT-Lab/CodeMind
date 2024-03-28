```python
def main():
    a, b, c = map(int, input().split())
    min_val = min(a, b)
    max_val = max(a, b)
    print(min(min_val, c), max(max_val, c))

if __name__ == "__main__":
    main()
``` 

Test Input:
4 5 3

Expected Output:
3 5 -91
```
