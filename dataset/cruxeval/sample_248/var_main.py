def f(a, b):
    a.sort()	## {"a" : ''}
    b.sort(reverse=True)	## {"b" : ''}
    return a + b	## {"a" : '',"b" : ''}
