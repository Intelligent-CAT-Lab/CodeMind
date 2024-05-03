def f(array, index, value):
    array.insert(0, index + 1)	## {"array" : '',"index" : ''}
    if value >= 1:	## {"value" : ''}
        array.insert(index, value)	## {"array" : '',"index" : '',"value" : ''}
    return array	## {"array" : ''}
