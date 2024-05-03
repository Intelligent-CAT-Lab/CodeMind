def f(s):
    for i in range(len(s)):	## {"i" : '',"s" : ''}
        if s[i].isdecimal():	## {"s" : '',"i" : ''}
            return i + (s[i] == '0')	## {"i" : '',"s" : ''}
        elif s[i] == '0':
            return -1
    return -1