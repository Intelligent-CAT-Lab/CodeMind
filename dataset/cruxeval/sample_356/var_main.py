def f(array, num):
    reverse = False	## {"reverse" : ''}
    if num < 0:	## {"num" : ''}
        reverse = True
        num *= -1
    array = array[::-1] * num	## {"array" : '',"num" : ''}
    l = len(array)	## {"l" : '',"array" : ''}
    
    if reverse:	## {"reverse" : ''}
        array = array[::-1]
    return array	## {"array" : ''}
