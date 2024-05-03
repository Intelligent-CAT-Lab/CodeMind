def f(array):
    prev = array[0]	## {"prev" : '',"array" : ''}
    newArray = array[:]	## {"newArray" : '',"array" : ''}
    for i in range(1, len(array)):	## {"i" : '',"array" : ''}
        if prev != array[i]:	## {"prev" : '',"array" : '',"i" : ''}
            newArray[i] = array[i]	## {"newArray" : '',"i" : '',"array" : ''}
        else:
            del newArray[i]
        prev = array[i]	## {"prev" : '',"array" : '',"i" : ''}
    return newArray	## {"newArray" : ''}
