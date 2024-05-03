def f(s, suffix):
    if not suffix:	## {"suffix" : ''}
        return s
    while s.endswith(suffix):	## {"s" : '',"suffix" : ''}
        s = s[:-len(suffix)]
    return s	## {"s" : ''}
