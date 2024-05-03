def f(array):
    a = []	## {"a" : ''}
    array.reverse()	## {"array" : ''}
    for i in range(len(array)):	## {"array" : ''}
        if array[i] != 0:
            a.append(array[i])
    a.reverse()	## {"a" : ''}
    return a	## {"a" : ''}
