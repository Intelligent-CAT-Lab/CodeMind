def f(x):
    if x.islower():	## {"x" : ''}
        return x	## {"x" : ''}
    else:
        return x[::-1]