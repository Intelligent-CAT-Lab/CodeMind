thigh_o_one = [1, 2, 7, 8, 9]
thigh_o_two = [1, 2, 7, 9]
def f(L, m, start, step):
    L.insert(start, m)	## L = [] | start = [] | m = []
    for x in range(start-1, 0, -step):	## x = [] | start = [] | step = []
        start -= 1	## start = []
        L.insert(start, L.pop(L.index(m)-1))	## L = [] | start = [] | m = []
    return L	## L = []
