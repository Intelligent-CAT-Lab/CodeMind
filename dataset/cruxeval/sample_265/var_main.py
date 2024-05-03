def f(d, k):
    new_d = {}	## {"new_d" : ''}
    for key, val in d.items():	## {"key" : '',"val" : '',"d" : ''}
        if key < k:	## {"key" : '',"k" : ''}
            new_d[key] = val	## {"new_d" : '',"key" : '',"val" : ''}
    return new_d	## {"new_d" : ''}
