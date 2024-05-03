def f(d):
    r = {	## r = CLRJ
        'c': d.copy(),	## d = CLRJ
        'd': d.copy()	## d = CLRJ
    }
    return (r['c'] is r['d'], r['c'] == r['d'])	## r = CLRJ
