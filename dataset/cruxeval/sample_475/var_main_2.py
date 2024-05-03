def f(array, index):
    if index < 0:	## index = []
        index = len(array) + index
    return array[index]	## array = [] | index = []
