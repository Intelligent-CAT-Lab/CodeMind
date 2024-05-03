def f(dictionary):
    a = dictionary.copy()	## <state>a = CLRJ | dictionary = CLRJ</state>
    for key in a:	## <state>a = CLRJ</state>
        if key%2 != 0:
            del a[key]
            a['$'+str(key)] = a[key]
    return a	## <state>a = CLRJ</state>
