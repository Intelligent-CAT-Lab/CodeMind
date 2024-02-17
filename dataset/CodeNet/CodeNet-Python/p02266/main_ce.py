def func(c):
    global cnt
    cnt += {'_':0, '/':1, '\\':-1}[c]
    return cnt
cnt = 0
g = [[0, False]] + [[func(c), False] for c in "\\//"]
gmax = g[0][0]
for i in range(1, len(g)):
    if g[i - 1][0] < g[i][0] <= gmax :
        g[i][1] = True
    gmax = max(gmax, g[i][0])
puddles = []
volume = 0
saface_level = None
for i in range(len(g) - 1, -1, -1):
    if saface_level != None:
        volume += saface_level  - g[i][0]
        if saface_level == g[i][0]:
            puddles += [volume]
            saface_level = None
            volume = 0
    if saface_level == None and g[i][1]:
        saface_level = g[i][0] 
puddles = puddles[::-1]
print(sum(puddles))
print(len(puddles), *puddles)