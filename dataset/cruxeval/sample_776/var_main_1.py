def f(dictionary):
    a = dictionary.copy()	## a = CLRJ | dictionary = CLRJ
    for key in a:	## a = CLRJ
        if key%2 != 0:
            del a[key]
            a['$'+str(key)] = a[key]
    return a	## a = CLRJ
