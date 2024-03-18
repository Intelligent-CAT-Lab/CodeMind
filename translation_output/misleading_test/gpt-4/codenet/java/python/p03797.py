Here is the translated code in Python:

```python
def main():
    N, M = map(int, input().split())
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum += (M - N * 2) // 4
    print(sum)

if __name__ == "__main__":
    main()
```

And to run the provided test case in your Python environment:

Input:
```1 6```

Expected output:
```
0
```
