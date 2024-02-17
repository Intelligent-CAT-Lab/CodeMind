def f(d):
    r = {
        'c': d.copy(),
        'd': d.copy()
    }
    return (r['c'] is r['d'], r['c'] == r['d'])