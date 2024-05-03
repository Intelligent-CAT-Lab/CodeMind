def f(x):
    a = 0	## {"a" : ''}
    for i in x.split(' '):	## {"i" : '',"x" : ''}
        a += len(i.zfill(len(i)*2))	## {"a" : '',"i" : ''}
    return a	## {"a" : ''}
