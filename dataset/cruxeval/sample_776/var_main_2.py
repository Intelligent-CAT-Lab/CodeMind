def f(dictionary):
    a = dictionary.copy()	## a = [] | dictionary = []
    for key in a:	## a = []
        if key%2 != 0:
            del a[key]
            a['$'+str(key)] = a[key]
    return a	## a = []
