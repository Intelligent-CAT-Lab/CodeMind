def f(array, elem):
    for idx, e in enumerate(array):	## idx = CLRJ | e = CLRJ | array = CLRJ
        if e > elem and array[idx - 1] < elem:	## e = CLRJ | elem = CLRJ | array = CLRJ | idx = CLRJ
            array.insert(idx, elem)	## array = CLRJ | idx = CLRJ | elem = CLRJ
    return array	## array = CLRJ
