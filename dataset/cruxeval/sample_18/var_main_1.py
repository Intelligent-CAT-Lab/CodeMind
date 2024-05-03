def f(array, elem):
    k = 0	## k = CLRJ
    l = array.copy()	## l = CLRJ | array = CLRJ
    for i in l:	## i = CLRJ | l = CLRJ
        if i > elem:	## i = CLRJ | elem = CLRJ
            array.insert(k, elem)	## array = CLRJ | k = CLRJ | elem = CLRJ
            break
        k += 1
    return array	## array = CLRJ
