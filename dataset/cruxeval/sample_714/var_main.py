def f(array):
    array.reverse()	## {"array" : ''}
    array.clear()	## {"array" : ''}
    array.extend('x'*len(array))	## {"array" : ''}
    array.reverse()	## {"array" : ''}
    return array	## {"array" : ''}
