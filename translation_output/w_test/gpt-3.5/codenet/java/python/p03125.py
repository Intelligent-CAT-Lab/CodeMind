```python
def main():
    a, b = map(int, input().split())
    print(a + b if b % a == 0 else b - a)

if __name__ == "__main__":
    main()
```

Test input:
4 12

Expected output:
16
```
