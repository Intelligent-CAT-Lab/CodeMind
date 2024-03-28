```python
def solve(N, A, B):
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    return base * A + mod

def main():
    N = int(input())
    A = int(input())
    B = int(input())
    result = solve(N, A, B)
    print(result)

if __name__ == "__main__":
    main()
```
