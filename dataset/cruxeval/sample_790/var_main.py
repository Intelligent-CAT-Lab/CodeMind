def f(d):
    r = {	## {"r" : ''}
        'c': d.copy(),	## {"d" : ''}
        'd': d.copy()	## {"d" : ''}
    }
    return (r['c'] is r['d'], r['c'] == r['d'])	## {"r" : ''}
