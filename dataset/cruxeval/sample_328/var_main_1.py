def f(array, L):
    if L <= 0:	## L = CLRJ
        return array
    if len(array) < L:	## array = CLRJ | L = CLRJ
        array.extend(f(array, L - len(array)))	## array = CLRJ | L = CLRJ
    return array	## array = CLRJ
