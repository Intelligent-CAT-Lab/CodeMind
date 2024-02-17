lst = [1, 2, 3, 4]
res, switch = [], True
while lst:
    res.append(min(lst) if switch else max(lst))
    lst.remove(res[-1])
    switch = not switch
print(res)