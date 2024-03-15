
```
import sys

def evenSolver(n, m, a, b, sy, sx):
    if n * m < 2 * (a + b):
        return False
    if n * m == 2 * (a + b) and a % 2 == 1:
        return False
    i = 0
    j = 0
    while a > 0:
        ans[sy + i][sx + j] = '<'
        ans[sy + i][sx + 1 + j] = '>'
        a -= 1
        if a > 0:
            ans[sy + 1 + i][sx + j] = '<'
            ans[sy + 1 + i][sx + 1 + j] = '>'
        a -= 1
        j += 2
        if j >= m:
            j = 0
            i += 2
    while b > 0:
        ans[sy + i][sx + j] = '^'
        ans[sy + i + 1][sx + j] = 'v'
        b -= 1
        if b > 0:
            ans[sy + i][sx + j + 1] = '^'
            ans[sy + 1 + i][sx + 1 + j] = 'v'
        b -= 1
        j += 2
        if j >= m:
            j = 0
            i += 2
    return True


def printSolve(t):
    if t:
        print("YES")
        for carray in ans:
            print(''.join(carray))
            print()
    else:
        print("NO")


N, M, A, B = map(int, sys.stdin.readline().split())
ans = [['.'] * M for _ in range(N)]

if N % 2 == 0 and M % 2 == 0:
    printSolve(evenSolver(N, M, A, B, 0, 0))
elif N % 2 == 0 or M % 2 == 0:
    if N % 2 == 0:
        for i in range(0, N, 2):
            if B > 0:
                B -= 1
                ans[i][0] = '^'
                ans[i + 1][0] = 'v'
        printSolve(evenSolver(N, M - 1, A, B, 0, 1))
    else:
        for j in range(0, M, 2):
            if A > 0:
                A -= 1
                ans[0][j] = '<'
                ans[0][j + 1] = '>'
        printSolve(evenSolver(N - 1, M, A, B, 1, 0))
else:
    ans_ = [['<', '>', '^'],
            ['^', '.', 'v'],
            ['v', '<', '>']]
    for i in range(0, N - 1, 2):
        if B > 0:
            B -= 1
            ans[i][M - 1] = '^'
            ans[i + 1][M - 1] = 'v'
    for j in range(0, M - 1, 2):
        if A > 0:
            A -= 1
            ans[N - 1][j] = '<'
            ans[N - 1][j + 1] = '>'
    if A > 0 and B > 0 and A % 2 == 1:
        for i in range(3):
            for j in range(3):
                ans[N - 3 + i][M - 3 + j] = ans_[i][j]
        A -= 1
        B -= 1
        printSolve(2 * (A + B) <= (N - 1) * (M - 1) - 4 and evenSolver(N - 1, M - 1, A, B, 0, 0))
    else:
        printSolve(evenSolver(N - 1, M - 1, A, B, 0, 0))
```

## 3430. 2048

### 题目描述

2048是一款非常流行的数字游戏，游戏的规则是：在一个4×4的棋盘上，开始时有两个数字，2或4，随机出现在棋盘的任意位置，玩家可以选择上下左右其中一个方向去滑动，每滑动一次，所有数字方块都会往滑动的方向靠拢外，系统也会在空白的地方随机出现一个数字方块，其数字是2或4。相同
