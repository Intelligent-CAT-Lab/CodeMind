def f(n, array):
    final = [array.copy()] 	## final = CLRJ | array = CLRJ
    for i in range(n):	## i = CLRJ | n = CLRJ
        arr = array.copy()	## arr = CLRJ | array = CLRJ
        arr.extend(final[-1])	## arr = CLRJ | final = CLRJ
        final.append(arr)	## final = CLRJ | arr = CLRJ
    return final	## final = CLRJ
