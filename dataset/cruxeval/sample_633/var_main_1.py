def f(array, elem):
    array.reverse()	## array = CLRJ
    try:
        found = array.index(elem)	## found = CLRJ | array = CLRJ | elem = CLRJ
    finally:
        array.reverse()	## array = CLRJ
    return found	## found = CLRJ
