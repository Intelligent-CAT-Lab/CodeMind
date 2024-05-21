def solve(N):
    N = int(N)
    s = str(N)
    l = len(s)
    m = int(s) * 9
    if m < N:
        return (m + 8) // 9
    else:
        return (N + 8) // 9