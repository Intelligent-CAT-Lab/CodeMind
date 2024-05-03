def f(array, arr):
    result = []	## result = []
    for s in arr:	## arr = []
        result += list(filter(lambda l: l != '', s.split(arr[array.index(s)])))
    return result	## result = []
