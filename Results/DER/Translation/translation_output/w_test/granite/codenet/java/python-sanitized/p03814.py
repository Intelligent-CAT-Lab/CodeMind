def solve():
    s = input()
    n = len(s)

    from_idx = 0
    to_idx = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_idx = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_idx = i
            break

    print(to_idx - from_idx + 1)

solve()