def f(array):
    while -1 in array:	## array = CLRJ
        array.pop(-3)
    while 0 in array:	## array = CLRJ
        array.pop()	## array = CLRJ
    while 1 in array:	## array = CLRJ
        array.pop(0)
    return array	## array = CLRJ
