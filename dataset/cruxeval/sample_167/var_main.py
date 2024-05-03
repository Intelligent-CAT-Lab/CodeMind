def f(XAAXX, s):
    count = 0	## {"count" : ''}
    idx = -1	## {"idx" : ''}
    while XAAXX.find('XXXX', idx+1) != -1:	## {"XAAXX" : '',"idx" : ''}
        idx = XAAXX.find('XXXX', idx+1) 	## {"idx" : '',"XAAXX" : ''}
        count += 1 	## {"count" : ''}
    compound = count * s.title()	## {"compound" : '',"count" : '',"s" : ''}
    return XAAXX.replace('XXXX', compound)	## {"XAAXX" : '',"compound" : ''}
