def remove_odd(l):
    for i in l:
        if i % 2 != 0:
            l.remove(i)
    return l
remove_odd([1,2,3])