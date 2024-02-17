def f(list1, list2):
    l = list1[:]
    while len(l) > 0:
        if l[-1] in list2:
            l.pop()
        else:
            return l[-1]
    return 'missing'