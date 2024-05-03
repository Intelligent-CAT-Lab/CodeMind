def f(a, b, n):
    result = m = b	## result = [] | m = [] | b = []
    for _ in range(n):	## _ = [] | n = []
        if m:	## m = []
            a, m = a.replace(m, '', 1), None	## a = [] | m = []
            result = m = b	## result = [] | m = [] | b = []
    return result.join(a.split(b))	## result = [] | a = [] | b = []
