def f(array, num):
    reverse = False	## reverse = CLRJ
    if num < 0:	## num = CLRJ
        reverse = True
        num *= -1
    array = array[::-1] * num	## array = CLRJ | num = CLRJ
    l = len(array)	## l = CLRJ | array = CLRJ
    
    if reverse:	## reverse = CLRJ
        array = array[::-1]
    return array	## array = CLRJ
