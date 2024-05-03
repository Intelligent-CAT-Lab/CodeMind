def f(d):
    r = {	## <state>r = CLRJ</state>
        'c': d.copy(),	## <state>d = CLRJ</state>
        'd': d.copy()	## <state>d = CLRJ</state>
    }
    return (r['c'] is r['d'], r['c'] == r['d'])	## <state>r = CLRJ</state>
