def f(dict0):
    new = dict0.copy()	## {"new" : '',"dict0" : ''}
    for i in range(len(new)-1):	## {"i" : '',"new" : ''}
        dict0[sorted(new)[i]] = i	## {"dict0" : '',"new" : '',"i" : ''}
    return dict0	## {"dict0" : ''}
