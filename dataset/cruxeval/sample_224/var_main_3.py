def f(array, value):
    array.reverse()	## <state>array = CLRJ</state>
    array.pop()	## <state>array = CLRJ</state>
    odd = []	## <state>odd = CLRJ</state>
    while len(array) > 0:	## <state>array = CLRJ</state>
        tmp = {}
        tmp[array.pop()] = value
        odd.append(tmp)
    result = {}	## <state>result = CLRJ</state>
    while len(odd) > 0:	## <state>odd = CLRJ</state>
        result.update(odd.pop())
    return result	## <state>result = CLRJ</state>
