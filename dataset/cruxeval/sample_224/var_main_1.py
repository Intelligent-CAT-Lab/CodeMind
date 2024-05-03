def f(array, value):
    array.reverse()	## array = CLRJ
    array.pop()	## array = CLRJ
    odd = []	## odd = CLRJ
    while len(array) > 0:	## array = CLRJ
        tmp = {}
        tmp[array.pop()] = value
        odd.append(tmp)
    result = {}	## result = CLRJ
    while len(odd) > 0:	## odd = CLRJ
        result.update(odd.pop())
    return result	## result = CLRJ
