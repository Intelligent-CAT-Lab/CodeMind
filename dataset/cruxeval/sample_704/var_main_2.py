def f(s, n, c):
    width = len(c)*n	## width = [] | c = [] | n = []
    for _ in range(width - len(s)):	## width = [] | s = []
        s = c + s
    return s	## s = []
