def f(array):
    a = []	## a = CLRJ
    array.reverse()	## array = CLRJ
    for i in range(len(array)):	## array = CLRJ
        if array[i] != 0:
            a.append(array[i])
    a.reverse()	## a = CLRJ
    return a	## a = CLRJ
