def f(strands):
    subs = strands	## {"subs" : '',"strands" : ''}
    for i, j in enumerate(subs):	## {"i" : '',"j" : '',"subs" : ''}
        for _ in range(len(j) // 2):	## {"_" : '',"j" : ''}
            subs[i] = subs[i][-1:] + subs[i][1:-1] + subs[i][0]	## {"subs" : '',"i" : ''}
    return ''.join(subs)	## {"subs" : ''}
