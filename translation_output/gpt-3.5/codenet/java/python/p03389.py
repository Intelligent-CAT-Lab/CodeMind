```python
def main():
    A = int(input())
    B = int(input())
    C = int(input())
    M = max(A, max(B, C))

    if (A + B + C) % 2 == M % 2:
        print((3 * M - (A + B + C)) // 2)
    else:
        print(((3 * M + 3) - (A + B + C)) // 2)

if __name__ == "__main__":
    main()
```
