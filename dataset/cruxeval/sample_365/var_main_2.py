def f(n, s):
    if s.startswith(n):	## s = [] | n = []
        pre, _ = s.split(n, 1)
        return pre + n + s[len(n):]
    return s	## s = []
