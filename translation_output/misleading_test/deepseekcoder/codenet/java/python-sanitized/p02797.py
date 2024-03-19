import sys

def solve(N, K, S):
    if K == 0:
        if S == 10**9:
            return [1]*N
        else:
            S += 1
            return [S]*N
    else:
        result = []
        for i in range(N):
            if i < K:
                result.append(S)
            else:
                if S == 10**9:
                    result.append(1)
                else:
                    result.append(S + 1)
        return result

N, K, S = map(int, sys.stdin.readline().split())
print(*solve(N, K, S))