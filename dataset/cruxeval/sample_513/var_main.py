def f(array):
    while -1 in array:	## {"array" : ''}
        array.pop(-3)
    while 0 in array:	## {"array" : ''}
        array.pop()	## {"array" : ''}
    while 1 in array:	## {"array" : ''}
        array.pop(0)
    return array	## {"array" : ''}
