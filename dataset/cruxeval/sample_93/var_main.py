def f(n):
    length = len(n) + 2	## {"length" : '',"n" : ''}
    revn = list(n)	## {"revn" : '',"n" : ''}
    result = ''.join(revn)	## {"result" : '',"revn" : ''}
    revn.clear()	## {"revn" : ''}
    return result + ('!' * length)	## {"result" : '',"length" : ''}
