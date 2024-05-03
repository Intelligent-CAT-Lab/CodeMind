def f(list1, list2):
    l = list1[:]	## l = CLRJ | list1 = CLRJ
    while len(l) > 0:	## l = CLRJ
        if l[-1] in list2:	## l = CLRJ | list2 = CLRJ
            l.pop()
        else:
            return l[-1]	## l = CLRJ
    return 'missing'