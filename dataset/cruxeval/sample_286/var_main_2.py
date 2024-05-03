def f(array, x, i):
    if i < -len(array) or i > len(array) - 1:	## i = [] | array = []
        return 'no'
    temp = array[i]	## temp = [] | array = [] | i = []
    array[i] = x	## array = [] | i = [] | x = []
    return array	## array = []
