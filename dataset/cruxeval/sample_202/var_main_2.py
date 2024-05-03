def f(array, list):
    array.extend(list)	## array = [] | list = []
    [e for e in array if e % 2 == 0]	## e = [] | array = []
    return [e for e in array if e >= 10]	## e = [] | array = []
