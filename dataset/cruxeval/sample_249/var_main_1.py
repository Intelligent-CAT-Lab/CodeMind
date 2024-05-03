def f(s):
    count = {}	## count = CLRJ
    for i in s:	## i = CLRJ | s = CLRJ
        if i.islower():	## i = CLRJ
            count[i.lower()] = s.count(i.lower()) + count.get(i.lower(), 0)
        else:
            count[i.lower()] = s.count(i.upper()) + count.get(i.lower(), 0)	## count = CLRJ | i = CLRJ | s = CLRJ
    return count	## count = CLRJ
