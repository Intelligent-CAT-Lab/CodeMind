def f(n, l):
    archive = {}	## <state>archive = CLRJ</state>
    for _ in range(n):	## <state>n = CLRJ</state>
        archive.clear()
        archive.update({x + 10: x * 10 for x in l})
    return archive	## <state>archive = CLRJ</state>
