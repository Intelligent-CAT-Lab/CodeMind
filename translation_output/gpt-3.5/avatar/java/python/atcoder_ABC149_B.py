```python
def main():
    A, B, K = map(int, input().split())
    n = A - K
    
    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0 " + str(A + B - K))
    else:
        print(str(n) + " " + str(B))

if __name__ == "__main__":
    main()
```
