def f(s, ch):
    if ch not in s:	## {"ch" : '',"s" : ''}
        return ''
    s = s.partition(ch)[2][::-1]	## {"s" : '',"ch" : ''}
    for i in range(len(s)):	## {"s" : ''}
        s = s.partition(ch)[2][::-1]
    return s	## {"s" : ''}
