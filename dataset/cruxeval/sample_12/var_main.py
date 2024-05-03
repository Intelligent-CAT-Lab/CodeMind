def f(s, x):
    count = 0	## {"count" : ''}
    while s[:len(x)] == x and count < len(s)-len(x):	## {"s" : '',"x" : '',"count" : ''}
        s = s[len(x):]
        count += len(x)
    return s	## {"s" : ''}
