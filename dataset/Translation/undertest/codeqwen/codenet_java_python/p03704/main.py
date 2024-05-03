import sys

def solve():
    D = int(input())
    ans = 0
    for len_ in range(len(str(D)), 19):
        ans += dfs(D, 0, len_)
    print(ans)

def dfs(rem, pos, len_):
    if len_ - pos - 1 < pos:
        return rem == 0
    if pos == len_ - 1 - pos:
        return rem == 0
    
    d = 1
    for i in range(1, len_ - pos - 1):
        d *= 10
    dm = 1
    for i in range(1, pos + 1):
        dm *= 10
    d -= dm
    if abs(rem) >= 10 * d:
        return 0
    ret = 0
    for i in range(-9, 10):
        if pos == 0 and i >= 0:
            ret += dfs(rem - d * i, pos + 1, len_) * (9 - abs(i))
        else:
            ret += dfs(rem - d * i, pos + 1, len_) * (10 - abs(i))
    return ret

if __name__ == "__main__":
    S = sys.perf_counter()
    solve()
    G = sys.perf_counter()
    print(f"{G-S:.2f}ms")