def f(strs):
    strs = strs.split()	## {"strs" : ''}
    for i in range(1, len(strs), 2):	## {"i" : '',"strs" : ''}
        strs[i] = ''.join(reversed(strs[i]))	## {"strs" : '',"i" : ''}
    return ' '.join(strs)	## {"strs" : ''}
