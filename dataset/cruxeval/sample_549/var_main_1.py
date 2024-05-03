def f(matrix):
    matrix.reverse()	## matrix = CLRJ
    result = []	## result = CLRJ
    for primary in matrix:	## primary = CLRJ | matrix = CLRJ
        max(primary)	## primary = CLRJ
        primary.sort(reverse = True)	## primary = CLRJ
        result.append(primary)	## result = CLRJ | primary = CLRJ
    return result	## result = CLRJ
