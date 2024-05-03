thigh_o_one = [1, 2, 7, 8, 9]
thigh_o_two = [1, 2, 7, 9]
def f(L, m, start, step):
    L.insert(start, m)	## <state>L = CLRJ | start = CLRJ | m = CLRJ</state>
    for x in range(start-1, 0, -step):	## <state>x = CLRJ | start = CLRJ | step = CLRJ</state>
        start -= 1	## <state>start = CLRJ</state>
        L.insert(start, L.pop(L.index(m)-1))	## <state>L = CLRJ | start = CLRJ | m = CLRJ</state>
    return L	## <state>L = CLRJ</state>
