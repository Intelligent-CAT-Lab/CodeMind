```python
def solve():
    N, A, B, C, D = map(int, input().split())

    for i in range(N):
        max_diff = D * (N - 1 - i) - C * i
        min_diff = C * (N - 1 - i) - D * i
        if abs(B - A) >= min_diff and abs(B - A) <= max_diff:
            print("YES")
            return
    print("NO")

# Process the test input
solve()
```
Now if you run the provided test input `5 1 5 2 4` for this Python code, it should produce the expected output `YES`.
