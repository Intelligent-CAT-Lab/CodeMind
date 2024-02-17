def f(dictionary):
    a = dictionary.copy()
    for key in a:
        if key%2 != 0:
            del a[key]
            a['$'+str(key)] = a[key]
    return a