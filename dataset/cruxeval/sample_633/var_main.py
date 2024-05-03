def f(array, elem):
    array.reverse()	## {"array" : ''}
    try:
        found = array.index(elem)	## {"found" : '',"array" : '',"elem" : ''}
    finally:
        array.reverse()	## {"array" : ''}
    return found	## {"found" : ''}
