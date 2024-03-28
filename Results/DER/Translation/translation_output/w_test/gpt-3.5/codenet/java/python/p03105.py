```python
def main():
    A, B, C = map(int, input().split())
    N = B // A
    if N > C:
        print(C)
    else:
        print(N)

if __name__ == "__main__":
    main()
```
