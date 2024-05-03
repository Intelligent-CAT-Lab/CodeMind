def f(string):
    count = string.count(':')	## {"count" : '',"string" : ''}
    return string.replace(':', '', count - 1)	## {"string" : '',"count" : ''}
