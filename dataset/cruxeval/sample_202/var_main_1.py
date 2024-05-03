def f(array, list):
    array.extend(list)	## array = CLRJ | list = CLRJ
    [e for e in array if e % 2 == 0]	## e = CLRJ | array = CLRJ
    return [e for e in array if e >= 10]	## e = CLRJ | array = CLRJ
