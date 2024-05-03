def f(array):
    array.reverse()	## array = CLRJ
    array.clear()	## array = CLRJ
    array.extend('x'*len(array))	## array = CLRJ
    array.reverse()	## array = CLRJ
    return array	## array = CLRJ
