def f(array, elem):
    k = 0	## {"k" : ''}
    l = array.copy()	## {"l" : '',"array" : ''}
    for i in l:	## {"i" : '',"l" : ''}
        if i > elem:	## {"i" : '',"elem" : ''}
            array.insert(k, elem)	## {"array" : '',"k" : '',"elem" : ''}
            break
        k += 1
    return array	## {"array" : ''}
