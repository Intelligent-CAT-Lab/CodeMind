def f(array, arr):
    result = []	## result = CLRJ
    for s in arr:	## arr = CLRJ
        result += list(filter(lambda l: l != '', s.split(arr[array.index(s)])))
    return result	## result = CLRJ
