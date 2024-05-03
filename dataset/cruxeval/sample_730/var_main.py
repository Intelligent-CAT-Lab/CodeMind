def f(text):
    m = 0	## {"m" : ''}
    cnt = 0	## {"cnt" : ''}
    for i in text.split():	## {"i" : '',"text" : ''}
        if len(i) > m:	## {"i" : '',"m" : ''}
            cnt += 1	## {"cnt" : ''}
            m = len(i)	## {"m" : '',"i" : ''}
    return cnt	## {"cnt" : ''}
