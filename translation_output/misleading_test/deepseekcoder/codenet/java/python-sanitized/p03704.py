def dfs(rem, pos, len):
    if len - pos - 1 < pos:
        return 1 if rem == 0 else 0
    if pos == len - 1 - pos:
        return 10 if rem == 0 else 0

    d = 1
    for _ in range(1, len - pos - 1 + 1):
        d *= 10

    dm = 1
    for _ in range(1, pos + 1):
        dm *= 10

    d -= dm
    if abs(rem) >= 10 * d:
        return 0
    ret = 0
    for i in range(-9, 10):
        if pos == 0 and i >= 0:
            ret += dfs(rem - d * i, pos + 1, len) * (9 - abs(i))
        else:
            ret += dfs(rem - d * i, pos + 1, len) * (10 - abs(i))
    return ret

def solve(D):
    ans = 0
    for len in range(len(str(D)), 19):
        res = dfs(D, 0, len)