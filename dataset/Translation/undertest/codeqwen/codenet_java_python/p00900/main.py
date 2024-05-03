import sys

INF = 1 << 28
EPS = 1e-10
size = 0
map = []
bomb = []
ps = []

def run():
    for line in sys.stdin:
        h, w = map(int, line.split())
        if h == 0 and w == 0:
            break
        
        map = [[-1 for _ in range(w)] for _ in range(h)]
        bomb = [[False for _ in range(w)] for _ in range(h)]
        ps = []
        for i in range(h):
            l = input()
            for j in range(w):
                if l[j] == '.':
                    map[i][j] = -1
                elif l[j] == '*':
                    map[i][j] = 0
                else:
                    map[i][j] = int(l[j])
                    ps.append((j, i))
        
        size = len(ps)
        pow10 = [100]
        S = pow10[0] * map[ps[0][1]][ps[0][0]]
        for i in range(1, size):
            pow10.append(pow10[i-1] * 10)
            S += pow10[i] * map[ps[i][1]][ps[i][0]]
        print(solve(S, 0))

def solve(S, cnt):
    p = S % 100
    if memo.get(S, None) is not None:
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return INF
    
    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S+1, 0)
            memo[S] = ret
            return ret
        else:
            return INF
    
    min = solve(S, cnt+1)
    x,