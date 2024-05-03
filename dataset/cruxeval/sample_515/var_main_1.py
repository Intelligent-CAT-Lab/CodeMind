def f(array):
    result = array.copy()	## result = CLRJ | array = CLRJ
    result.reverse()	## result = CLRJ
    result[:] = [item * 2 for item in result]	## result = CLRJ | item = CLRJ
    return result	## result = CLRJ
