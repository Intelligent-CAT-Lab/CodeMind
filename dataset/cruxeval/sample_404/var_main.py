def f(no):
    d = dict.fromkeys(no, False) 	## {"d" : '',"no" : ''}
    return sum([1 for i in d.keys()])	## {"i" : '',"d" : ''}
