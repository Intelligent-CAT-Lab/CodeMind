def f(s, n, c):
    width = len(c)*n
    for _ in range(width - len(s)):
        s = c + s
    return s