L = thigh_o_two[:]
m = 3
start = 3
step = 2

L.insert(start, m)
for x in range(start-1, 0, -step):
    start -= 1
    L.insert(start, L.pop(L.index(m)-1))
print(L)