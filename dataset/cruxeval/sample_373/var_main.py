def f(orig):
    copy = orig	## {"copy" : '',"orig" : ''}
    copy.append(100)	## {"copy" : ''}
    orig.pop()	## {"orig" : ''}
    return copy	## {"copy" : ''}
