def f(n, s):
    if s.startswith(n):	## s = CLRJ | n = CLRJ
        pre, _ = s.split(n, 1)
        return pre + n + s[len(n):]
    return s	## s = CLRJ
