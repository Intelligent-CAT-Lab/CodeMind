```python
def main():
    N, K = map(int, input().split())
    ans = K
    for i in range(2, N+1):
        ans *= (K-1)
    print(ans)

if __name__ == "__main__":
    main()
```
