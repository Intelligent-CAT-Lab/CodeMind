def f(array, elem):
    for idx, e in enumerate(array):	## {"idx" : '',"e" : '',"array" : ''}
        if e > elem and array[idx - 1] < elem:	## {"e" : '',"elem" : '',"array" : '',"idx" : ''}
            array.insert(idx, elem)	## {"array" : '',"idx" : '',"elem" : ''}
    return array	## {"array" : ''}
