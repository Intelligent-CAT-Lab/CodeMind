thigh_o_one = [1, 2, 7, 8, 9]
thigh_o_two = [1, 2, 7, 9]
def f(L, m, start, step):
    L.insert(start, m)	## L = CLRJ | start = CLRJ | m = CLRJ
    for x in range(start-1, 0, -step):	## x = CLRJ | start = CLRJ | step = CLRJ
        start -= 1	## start = CLRJ
        L.insert(start, L.pop(L.index(m)-1))	## L = CLRJ | start = CLRJ | m = CLRJ
    return L	## L = CLRJ
