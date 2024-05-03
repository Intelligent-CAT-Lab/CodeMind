def f(s):
    r = []	## r = []
    for i in range(len(s) - 1, 0 - 1, -1):	## i = [] | s = []
        r += s[i]	## r = [] | s = [] | i = []
    return ''.join(r)	## r = []
