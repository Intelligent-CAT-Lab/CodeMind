def f(n, l):
    archive = {}	## archive = []
    for _ in range(n):	## n = []
        archive.clear()
        archive.update({x + 10: x * 10 for x in l})
    return archive	## archive = []
