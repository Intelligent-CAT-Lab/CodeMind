def f(array, L):
    if L <= 0:	## {"L" : ''}
        return array
    if len(array) < L:	## {"array" : '',"L" : ''}
        array.extend(f(array, L - len(array)))	## {"array" : '',"L" : ''}
    return array	## {"array" : ''}
