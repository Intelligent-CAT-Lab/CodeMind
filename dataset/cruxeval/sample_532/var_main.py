def f(n, array):
    final = [array.copy()] 	## {"final" : '',"array" : ''}
    for i in range(n):	## {"i" : '',"n" : ''}
        arr = array.copy()	## {"arr" : '',"array" : ''}
        arr.extend(final[-1])	## {"arr" : '',"final" : ''}
        final.append(arr)	## {"final" : '',"arr" : ''}
    return final	## {"final" : ''}
