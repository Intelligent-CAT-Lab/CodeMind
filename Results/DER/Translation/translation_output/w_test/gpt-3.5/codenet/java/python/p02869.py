```python
import sys

def solve(N, K):
    avg = K + K + N + N - 1
    abi = [[0, 0, 0] for _ in range(N)]

    for i in range(N):
        a = K + i
        b = avg - a
        abi[i][0] = a
        abi[i][1] = b

    n = N if N % 2 == 1 else N - 1
    if (n // 2) % 2 == 0:
        eve = -(n // 2)
        eveTime = n // 2 + 1
        for i in range(eveTime):
            abi[i][2] = eve
            eve += 2

        odd = -(n // 2) + 1
        oddTime = n // 2
        for i in range(oddTime):
            abi[i + eveTime][2] = odd
            odd += 2
    else:
        eve = -(n // 2) + 1
        eveTime = n // 2
        for i in range(eveTime):
            abi[i][2] = eve
            eve += 2

        odd = -n // 2
        oddTime = n // 2 + 1
        for i in range(oddTime):
            abi[i + eveTime][2] = odd
            odd += 2

    abi.sort(key=lambda x: x[2])
    for i in range(n):
        abi[i][1] += abi[i][2]

    ans = [[0, 0, 0] for _ in range(N)]
    for i in range(N):
        c = K + N + N + i
        ans[i][0] = abi[i][0]
        ans[i][1] = abi[i][1]
        ans[i][2] = c

    for i in range(N):
        if ans[i][0] + ans[i][1] > ans[i][2]:
            return None

    return ans

if __name__ == '__main__':
    N, K = map(int, input().split())
    ans = solve(N, K)

    if ans is not None:
        for each in ans:
            print(each[0], each[1], each[2])
    else:
        print(-1)
```
```
