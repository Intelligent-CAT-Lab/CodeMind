low = 1
high = 3 ** 32

def dfs(pos, pace):
    if pos > n:
        return 0
        
    if pace < high:
        npace = 3 * pace
        npos = pos + npace
        if npos == n and (npace == 1 or npace == 3):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    
    npace = pace
    npos = npace + pos
    if npos == n and (npace == 1 or npace == 3):
        return 1
    else:
        temp = dfs(npos, npace)
        if temp != 0:
            return 1 + temp
    
    if pace > low:
        npace = pace // 3
        npos = pos + npace
        if npos == n and (npace == 3 or npace == 1):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    return 0

n = int(input())
ans = -1 if n == 0 else dfs(1, 1)
print(ans + 1)