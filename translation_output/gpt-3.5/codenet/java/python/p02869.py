```python
import sys
import heapq

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = iter(input().split())
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

N, K = map(int, input().split())

def solve():
    ans = []
    avg = K + K + N + N - 1
    abi = [[0, 0, 0] for _ in range(N)]

    for i in range(N):
        a = K + i
        b = avg - a
        abi[i][0] = a
        abi[i][1] = b

    n = N
    if N % 2 == 0:
        n = N - 1
        abi[N-1][2] = float('inf')
    
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

    for i in range(N):
        c = K + N + N + i
        ans.append([abi[i][0], abi[i][1], c])

    for each in ans:
        print(each[0], each[1], each[2])

    valid = all(each[0] + each[1] <= each[2] for each in ans)
    return ans if valid else None

if __name__ == '__main__':
    scanner = FastScanner()
    ans = solve()
    if ans is None:
        print(-1)
```

