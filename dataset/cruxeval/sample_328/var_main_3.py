def f(array, L):
    if L <= 0:	## <state>L = CLRJ</state>
        return array
    if len(array) < L:	## <state>array = CLRJ | L = CLRJ</state>
        array.extend(f(array, L - len(array)))	## <state>array = CLRJ | L = CLRJ</state>
    return array	## <state>array = CLRJ</state>
