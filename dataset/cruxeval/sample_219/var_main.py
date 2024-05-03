def f(s1, s2):
    for k in range(0, len(s2)+len(s1)):	## {"k" : '',"s2" : '',"s1" : ''}
        s1 += s1[0]	## {"s1" : ''}
        if s1.find(s2) >= 0:	## {"s1" : '',"s2" : ''}
            return True
    return False