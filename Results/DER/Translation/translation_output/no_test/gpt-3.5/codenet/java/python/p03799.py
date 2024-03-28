```python
import sys

if __name__ == "__main__":
    N, M = map(int, input().split())
    ans = 0

    if N > M:
        print(M//2)
        sys.exit(0)

    if N == 1 and M == 1:
        print(0)
        sys.exit(0)

    if N == 2 and M == 1:
        print(0)
        sys.exit(0)

    if N * 2 > M:
        print(M//2)
        sys.exit(0)

    ans = N + ((M - N * 2) // 4)

    # for _ in range(sys.maxsize):
    #     if M - 2 >= (N + 1) * 2:
    #         M -= 2
    #         N += 1
    #     else:
    #         break

    print(ans)
```
