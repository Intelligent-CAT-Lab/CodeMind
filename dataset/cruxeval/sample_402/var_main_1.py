def f(n, l):
    archive = {}	## archive = CLRJ
    for _ in range(n):	## n = CLRJ
        archive.clear()
        archive.update({x + 10: x * 10 for x in l})
    return archive	## archive = CLRJ
