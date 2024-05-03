def f(array, values):
    array.reverse()	## array = []
    for value in values:	## value = [] | values = []
        array.insert(len(array) // 2, value)	## array = [] | value = []
    array.reverse()	## array = []
    return array	## array = []
