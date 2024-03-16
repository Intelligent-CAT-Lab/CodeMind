```python
def main():
    try:
        a, b = map(int, input().split())
        print("Brown" if abs(a - b) <= 1 else "Alice")
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
``` 

Test input:
```
2 1
```

Expected output:
```
Brown
```
