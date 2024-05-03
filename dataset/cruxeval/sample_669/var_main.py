def f(t):
    a, sep, b = t.rpartition('-')	## {"a" : '',"sep" : '',"b" : '',"t" : ''}
    if len(b) == len(a):	## {"b" : '',"a" : ''}
        return 'imbalanced'
    return a + b.replace(sep, '')	## {"a" : '',"b" : '',"sep" : ''}
