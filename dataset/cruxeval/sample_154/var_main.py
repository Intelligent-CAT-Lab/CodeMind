def f(s, c):
    s = s.split(' ')	## {"s" : ''}
    return ((c + "  ") + ("  ".join(s[::-1])))	## {"c" : '',"s" : ''}
