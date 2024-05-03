def f(number):
    transl = {'A': 1, 'B': 2, 'C': 3, 'D': 4, 'E': 5}	## transl = CLRJ
    result = []	## result = CLRJ
    for key, value in transl.items():	## key = CLRJ | value = CLRJ | transl = CLRJ
        if value % number == 0:	## value = CLRJ | number = CLRJ
            result.append(key)	## result = CLRJ | key = CLRJ
    return result	## result = CLRJ
