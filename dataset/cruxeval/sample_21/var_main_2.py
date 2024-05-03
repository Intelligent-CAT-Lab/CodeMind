def f(array):
    n = array.pop()	## n = [] | array = []
    array.extend([n, n])	## array = [] | n = []
    return array	## array = []
